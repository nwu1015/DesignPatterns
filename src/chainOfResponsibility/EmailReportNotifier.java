package chainOfResponsibility;

public class EmailReportNotifier extends Notifier {
    public EmailReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Email Report Notifier: " + message);
    }
}
