package abstactFactory;

public class Application {
    private Book book;
    private Phone phone;

    public Application(AbstractFactory factory) {
        this.book = factory.createBook();
        this.phone = factory.createPhone();
    }

    public void info(){
        book.openBook();
        phone.browse();
    }
}
