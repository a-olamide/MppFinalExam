package hospital_management_system;

public enum NotificationSystem {;
    private static  NotificationSystem INSTANCE;

    public static NotificationSystem getInstance() {
        return INSTANCE;

    }
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }


}
