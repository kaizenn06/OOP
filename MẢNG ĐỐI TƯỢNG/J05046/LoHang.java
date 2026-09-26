package J05046;

public class LoHang {
    private String id, name;
    private long discount, money;
    public LoHang(String id, String name, int quantity, long price) {
        this.id = id;
        this.name = name;
        long t = quantity * price;
        if (quantity > 10) this.discount = t * 5 / 100;
        else if (8 <= quantity && quantity <= 10) this.discount = t * 2 / 100;
        else if (5 <= quantity && quantity < 8) this.discount = t * 1 / 100;
        else this.discount = 0;
        this.money = t - this.discount;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, name, discount, money);
    }
}
