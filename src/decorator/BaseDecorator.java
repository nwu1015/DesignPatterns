package decorator;

public class BaseDecorator implements Developer{
    private Developer developer;

    public BaseDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
