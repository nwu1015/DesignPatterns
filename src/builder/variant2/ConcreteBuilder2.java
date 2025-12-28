package builder.variant2;

public class ConcreteBuilder2 extends Builder {
    @Override
    void createName() {
        website.setName("ConcreteBuilder2");
    }

    @Override
    void createPrice() {
        website.setPrice(1);
    }

    @Override
    void createSms() {
        website.setSms("ConcreteBuilder2 sms");
    }
}
