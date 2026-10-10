package J07019;

public class SanPham {
    private String id, name;
    private long price1, price2;

    public SanPham(String id, String name, long price1, long price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice(long type) {
        if (type == 1 ) return price1;
        else return price2;
    }
}
