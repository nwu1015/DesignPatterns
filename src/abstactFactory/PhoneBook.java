package abstactFactory;

public class PhoneBook implements Book{

    @Override
    public void openBook() {
        System.out.println("Phone Book");
    }

    @Override
    public void closeBook() {
        System.out.println("Phone Book");
    }
}
