class NotificationRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        EmailNotification emailNotification = new EmailNotification();

        emailNotification.send();

        System.out.println("Main Ended");
    }
}