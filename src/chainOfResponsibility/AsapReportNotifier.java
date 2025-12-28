package chainOfResponsibility;

public class AsapReportNotifier extends Notifier {
    public AsapReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("ASAP Report Notifier: " + message);
    }
}
