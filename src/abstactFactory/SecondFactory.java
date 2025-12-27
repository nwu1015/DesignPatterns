package abstactFactory;

public class SecondFactory implements AbstractFactory {
    @Override
    public Book createBook() {
        return new PhoneBook();
    }

    @Override
    public Phone createPhone() {
        return new IphonePhone();
    }
}
