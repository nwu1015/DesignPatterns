package prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(Rectangle r) {
        super(r);
        this.width = r.width;
        this.height = r.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
