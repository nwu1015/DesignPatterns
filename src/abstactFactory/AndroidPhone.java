package abstactFactory;

public class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling Android");
    }

    @Override
    public void browse() {
        System.out.println("Browsing");
    }
}
