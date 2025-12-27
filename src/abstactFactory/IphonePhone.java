package abstactFactory;

public class IphonePhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling Iphone");
    }

    @Override
    public void browse() {
        System.out.println("Browsing iphone");
    }
}
