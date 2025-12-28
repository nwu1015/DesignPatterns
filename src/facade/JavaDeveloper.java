package facade;

public class JavaDeveloper {
    public void startWork(BugTracker bugTracker) {
        if(bugTracker.isActive()){
            System.out.println("I am Work");
        }else {
            System.out.println("I am Not Work");
        }
    }
}
