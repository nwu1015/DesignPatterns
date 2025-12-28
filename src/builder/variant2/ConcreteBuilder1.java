package builder.variant2;

public class ConcreteBuilder1 extends Builder {
    @Override
    void createName() {
        website.setName("ConcreteBuilder1");
    }

    @Override
    void createPrice() {
        website.setPrice(10);
    }

    @Override
    void createSms() {
        website.setSms("ConcreteBuilder1 sms");
    }
}
