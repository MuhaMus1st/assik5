public interface Observer {
    void update(String message);
}

public class NotificationService implements Observer {
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}
