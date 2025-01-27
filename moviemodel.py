import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.ensemble import RandomForestClassifier
from sklearn.preprocessing import LabelEncoder
from sklearn.metrics import accuracy_score

# Load and prepare the data
df = pd.read_csv('MYmovies (1).csv')

# Prepare features
# Using overview and other numerical features
X_text = df['overview'].fillna('')
X_numerical = df[['popularity', 'vote_average']].fillna(0)

# Convert release_date to numerical features
df['release_date'] = pd.to_datetime(df['release_date'], errors='coerce')
df['release_year'] = df['release_date'].dt.year
df['release_month'] = df['release_date'].dt.month
X_date = df[['release_year', 'release_month']].fillna(0)

# Prepare target
le = LabelEncoder()
y = le.fit_transform(df['title'])

# Transform text features
tfidf = TfidfVectorizer(max_features=1000)
X_text_features = tfidf.fit_transform(X_text)

# Combine all features
X_numerical_array = np.hstack([X_numerical, X_date])
X_combined = np.hstack([X_text_features.toarray(), X_numerical_array])

# Split the data
X_train, X_test, y_train, y_test = train_test_split(X_combined, y, test_size=0.2, random_state=42)

# Train the model
rf_model = RandomForestClassifier(n_estimators=100, random_state=42)
rf_model.fit(X_train, y_train)

# Make predictions and evaluate
y_pred = rf_model.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)

print("Model Accuracy:", accuracy)

# Show a few example predictions
sample_indices = np.random.randint(0, len(X_test), 5)
print("\
Sample Predictions:")
for idx in sample_indices:
    predicted_title = le.inverse_transform([y_pred[idx]])[0]
    actual_title = le.inverse_transform([y_test[idx]])[0]
    print(f"Predicted: {predicted_title}")
    print(f"Actual: {actual_title}")
    print("---")