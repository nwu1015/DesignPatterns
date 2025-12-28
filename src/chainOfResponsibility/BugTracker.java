package chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleReportNotifier(1);
        Notifier emailNotifier = new EmailReportNotifier(2);
        Notifier asapNotifier = new AsapReportNotifier(3);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(asapNotifier);

        simpleNotifier.notifyManager("12334", 3);
        emailNotifier.notifyManager("12334", 3);
    }
}
