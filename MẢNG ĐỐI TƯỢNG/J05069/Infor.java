package J05069;

public class Infor {
    private String id;
    private Squad sq;
    private long quantity;
    public Infor(String id, Squad sq, long quantity) {
        this.id = id;
        this.sq = sq;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d", id, sq.getName(), sq.getPrice() * quantity);
    }
}
