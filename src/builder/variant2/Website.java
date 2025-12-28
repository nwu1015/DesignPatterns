package builder.variant2;

public class Website {
    private String name;
    private int price;
    private String sms;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sms='" + sms + '\'' +
                '}';
    }
}
