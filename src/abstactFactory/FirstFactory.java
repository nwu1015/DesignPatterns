package abstactFactory;

public class FirstFactory implements AbstractFactory {
    @Override
    public Book createBook() {
        return new PaperBook();
    }

    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }
}
