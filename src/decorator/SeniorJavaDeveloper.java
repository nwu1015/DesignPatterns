package decorator;

public class SeniorJavaDeveloper extends BaseDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String doSmth(){
        return "Senior Java Developer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + doSmth();
    }
}
