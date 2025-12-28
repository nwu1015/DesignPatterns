package facade;

public class WorkFacade {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    JavaDeveloper javaDeveloper = new JavaDeveloper();

    public void solveProblem(){
        job.makeJob();
        bugTracker.startSprint();
        javaDeveloper.startWork(bugTracker);
    }
}
