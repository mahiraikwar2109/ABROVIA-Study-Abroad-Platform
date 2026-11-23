
public class NotificationTask implements Runnable {

    private String studentName;
    private String country;

    public NotificationTask(String studentName, String country) {
        this.studentName = studentName;
        this.country = country;
    }

    @Override
    public void run() {
        System.out.println("\n===== BACKGROUND TASK =====");

        System.out.println(
            "Processing confirmation for: " + studentName
        );

        System.out.println(
            "Study destination: " + country
        );

        System.out.println(
            "Registration confirmation processed!"
        );

        System.out.println(
            "Thread name: " + Thread.currentThread().getName()
        );
    }
}
