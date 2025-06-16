public class NotificationTest {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);
        Notifier multiNotifier = new SlackNotifierDecorator(smsNotifier);

        multiNotifier.send("Your order has been shipped!");
    }
}
