
public class Student extends Person implements Registrable {

    private String country;
    private String course;

    public Student(String name, String email,
                   String country, String course) {

        super(name, email);

        this.country = country;
        this.course = course;
    }

    @Override
    public void register() {
        System.out.println("Student registered successfully!");
    }

    public void displayDetails() {
        System.out.println("\n===== STUDENT DETAILS =====");

        displayBasicDetails();

        System.out.println("Country: " + country);
        System.out.println("Course: " + course);
    }
}
