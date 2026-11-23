
public class StudyDestination {
    String country;
    String university;
    double tuitionFee;
    String course;

    public StudyDestination(String country, String university,
                            double tuitionFee, String course) {
        this.country = country;
        this.university = university;
        this.tuitionFee = tuitionFee;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Country: " + country);
        System.out.println("University: " + university);
        System.out.println("Course: " + course);
        System.out.println("Annual Tuition Fee: $" + tuitionFee);
        System.out.println("--------------------------------");
    }
}
