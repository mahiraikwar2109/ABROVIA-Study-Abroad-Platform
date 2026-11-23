
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void validateStudent(String name, String email,
            String country, String course)
            throws InvalidStudentException {

        if (name.isEmpty() || email.isEmpty()
                || country.isEmpty() || course.isEmpty()) {
            throw new InvalidStudentException(
                "All fields are required!"
            );
        }

        if (!email.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new InvalidStudentException(
                "Please enter a valid email address!"
            );
        }
    }

    public static void saveStudent(String name, String email,
            String country, String course) throws IOException {

        FileWriter writer = new FileWriter("students.txt", true);

        writer.write("Name: " + name + "\n");
        writer.write("Email: " + email + "\n");
        writer.write("Country: " + country + "\n");
        writer.write("Course: " + course + "\n");
        writer.write("-----------------------------\n");

        writer.close();

        System.out.println("\nStudent record saved successfully!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== ABROVIA REGISTRATION =====");

            System.out.print("Enter your name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter your email: ");
            String email = sc.nextLine().trim();

            System.out.print("Enter preferred country: ");
            String country = sc.nextLine().trim();

            System.out.print("Enter preferred course: ");
            String course = sc.nextLine().trim();

            validateStudent(name, email, country, course);

            Student student = new Student(
                name, email, country, course
            );

            student.displayDetails();

            student.register();

            saveStudent(name, email, country, course);
            // Create and start a background thread
            NotificationTask task = new NotificationTask(name, country);

            Thread notificationThread = new Thread(task);

            notificationThread.start();

            try {
                notificationThread.join();
            } catch (InterruptedException e) {
                System.out.println("Notification interrupted!");
            }
            } catch (InvalidStudentException e) {
                System.out.println("Registration Error: " + e.getMessage());

            } catch (IOException e) {
                System.out.println("File Error: Unable to save student record.");
            }

        sc.close();
    }
}
