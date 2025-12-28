package decorator;

public class TeamLeadJavaDeveloper extends BaseDecorator{
    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String doSmth(){
        return "TeamLead Java Developer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + doSmth();
    }
}
