public class Notification {
    public static void sendNotification(User user, String message) {
        System.out.println("Notification to " + user.getName() + ": " + message);
    }
}
