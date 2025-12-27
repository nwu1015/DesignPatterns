package prototype;

public class Client {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setX(100);
        circle.setY(100);
        circle.setColor("red");

        Circle circle2 = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(circle2);
    }
}
