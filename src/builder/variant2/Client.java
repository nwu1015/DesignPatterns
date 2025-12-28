package builder.variant2;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder1());
        System.out.println(director.buildWebsite());
    }
}
