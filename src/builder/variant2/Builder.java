package builder.variant2;

public abstract class Builder {
    Website website;

    void createWebsite(){
        website = new Website();
    }
    abstract void createName();
    abstract void createPrice();
    abstract void createSms();

    Website getWebsite() {
        return website;
    }
}
