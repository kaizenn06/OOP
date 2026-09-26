package J05070;

public class Infor implements Comparable<Infor> {
    private String id;
    private Squad sq;
    private long quantity, money;
    public Infor(String id, Squad sq, long quantity) {
        this.id = id;
        this.sq = sq;
        this.quantity = quantity;
        this.money = this.quantity * this.sq.getPrice();
    }
    @Override
    public int compareTo(Infor that) {
        if (this.money != that.money) {
            return Long.compare(that.money, this.money);
        }
        return this.sq.getName().compareTo(that.sq.getName());
    }
    @Override
    public String toString() {
        return String.format("%s %s %d", id, sq.getName(), money);
    }
}
