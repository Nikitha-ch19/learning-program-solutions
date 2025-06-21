public class TestDecoratorPattern {
    public static void main(String[] args) {
        Notifier emailOnly = new EmailNotifier();
        System.out.println("Email Only:");
        emailOnly.send("Your OTP is 123456");

        System.out.println("\nEmail + SMS:");
        Notifier emailSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailSMS.send("Your OTP is 123456");

        System.out.println("\nEmail + SMS + Slack:");
        Notifier allChannels = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        allChannels.send("Your OTP is 123456");
    }
}
