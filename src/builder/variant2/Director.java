package builder.variant2;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.createSms();
        builder.createName();
        builder.createPrice();

        return builder.getWebsite();
    }
}
