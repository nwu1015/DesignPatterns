package prototype.variant2;

public class CloneFactory {
    private Person person;

    public CloneFactory(Person person) {
        this.person = person;
    }

    public Person createClonePerson() {
        return (Person) person.clone();
    }
}
