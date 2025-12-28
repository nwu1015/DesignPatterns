package facade;

public class BugTracker {
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void startSprint(){
        System.out.println("Sprint is started");
        isActive = true;
    }

    public void stopSprint(){
        System.out.println("Sprint is stopped");
        isActive = false;
    }
}
