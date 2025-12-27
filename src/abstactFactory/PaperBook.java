package abstactFactory;

public class PaperBook implements Book{
    @Override
    public void openBook() {
        System.out.println("Paper Book");
    }

    @Override
    public void closeBook() {
        System.out.println("Paper Book");
    }
}
