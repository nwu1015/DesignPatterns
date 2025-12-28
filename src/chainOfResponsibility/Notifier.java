package chainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier notifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyManager(String message, int priority) {
        if(priority >= this.priority) {
            write(message);
        }
        if(notifier != null) {
            notifier.notifyManager(message, priority);
        }
    }

    public abstract void write(String message);
}
