package abstactMethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows button on clicked");
    }
}
