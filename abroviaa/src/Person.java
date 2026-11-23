
public class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayBasicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
