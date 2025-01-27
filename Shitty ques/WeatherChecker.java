import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherChecker {

    private static final String API_KEY = "your_openweathermap_api_key"; 
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String location = "London"; 
        printCurrentWeather(location);
    }

    public static void printCurrentWeather(String location) {
        try {
   
            String urlString = String.format("%s?q=%s&appid=%s&units=metric", API_URL, location, API_KEY);

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            connection.disconnect();

            JSONObject jsonObject = new JSONObject(content.toString());

            JSONObject main = jsonObject.getJSONObject("main");
            JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);

            System.out.println("Location: " + location);
            System.out.println("Temperature: " + main.get("temp") + "°C");
            System.out.println("Weather: " + weather.get("description"));
            System.out.println("Humidity: " + main.get("humidity") + "%");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}