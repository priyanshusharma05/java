import java.util.Arrays;

public class Solution {
    // Static method to find students by grade and month
    public static Student[] findStudentByGradeAndMonth(Student[] students, char grade, int month) {
        // Convert month to string
        String monthStr = String.format("%02d", month);

        // Filter students by grade and month
        Student[] filteredStudents = Arrays.stream(students)
                .filter(student -> student.getGrade() == grade && student.getDate().split("/")[1].equals(monthStr))
                .toArray(Student[]::new);

        // Sort filtered students by rollNo
        Arrays.sort(filteredStudents, (a, b) -> Integer.compare(a.getRollNo(), b.getRollNo()));

        // Return filtered students if not empty, otherwise return null
        return filteredStudents.length > 0 ? filteredStudents : null;
    }

    public static void main(String[] args) {
        // Create Student objects
        Student[] students = new Student[] {
                new Student(111, "Arijit", "Math", 'B', "22/09/2023"),
                new Student(101, "Priyanka", "English", 'A', "30/03/2022"),
                new Student(107, "Shreosi", "History", 'C', "13/05/2022"),
                new Student(105, "Tatan", "Physics", 'A', "27/03/2022")
        };

        // Find students by grade and month
        char grade = 'A';
        int month = 3;
        Student[] result = findStudentByGradeAndMonth(students, grade, month);

        // Print result
        if (result != null) {
            for (Student student : result) {
                System.out.println(student.getName());
                System.out.println(student.getSubject());
            }
            System.out.println(result.length);
        } else {
            System.out.println("No student found");
        }
    }
}