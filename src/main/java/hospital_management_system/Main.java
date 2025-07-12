package hospital_management_system;

public class Main {
    public static void main(String[] args) {
        NotificationSystem instance = NotificationSystem.getInstance();
        instance.sendAlert("Alert");
    }
}
