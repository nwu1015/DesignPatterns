package prototype.variant2;

public class Client {
    public static void main(String[] args) {

        Person person = new Person("John", "Smith", 25);

        CloneFactory factory = new CloneFactory(person);
        Person person2 = factory.createClonePerson();

        System.out.println(person);
        System.out.println(person2);
    }
}
