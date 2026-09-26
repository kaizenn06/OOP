package J05073;

public class Order {
    private String id;
    private Character code, license;
    private int price, quantity;
    private long money;
    private double tax, fee;
    public Order(String id, int price, int quantity) {
        this.id = id;
        this.code = id.charAt(0);
        this.license = id.charAt(id.length() - 1);
        this.price = price;
        this.quantity = quantity;
        this.money = (long)this.price * this.quantity;
        this.tax = THUE();
        this.fee = PHI();
        this.money += tax + fee;
        this.money = Math.round((this.money * 1.2) / 100.0 * 100.0);
    }
    private double THUE() {
        if (license == 'C') tax = 0.95;
        else tax = 1;
        switch(code) {
            case 'T' : return money * tax * 0.29;
            case 'C' : return money * tax * 0.1;
            case 'D' : return money * tax * 0.08;
            case 'M' : return money * tax * 0.02;
            default : return money * tax;
        }
    }
    private double PHI() {
        switch (code) {
            case 'T' : return money * 0.04;
            case 'C' : return money * 0.03;
            case 'D' : return money * 0.025;
            case 'M' : return money * 0.005;
            default : return money;
        }
    }
    @Override
    public String toString() {
        return String.format("%s %.2f", id, (double)money / quantity);
    }
}
