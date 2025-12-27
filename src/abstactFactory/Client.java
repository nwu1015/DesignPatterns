package abstactFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new SecondFactory();

        Application app = new Application(factory);

        app.info();
    }
}
