package J06009;

public class MatHang {
    private String id, name, type;
    private long buy, sell;
    public MatHang(int id, String name, String type, long buy, long sell) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public long getBuy() {
        return buy;
    }
    public long getSell() {
        return sell;
    }
}
