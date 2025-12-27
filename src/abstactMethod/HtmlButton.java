package abstactMethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Html button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Html button on clicked");
    }
}
