package J06002;

public class SanPham {
    private String id, name;
    private long price_l1, price_l2;
    public SanPham(String id, String name, long price_l1, long price_l2) {
        this.id = id;
        this.name = name;
        this.price_l1 = price_l1;
        this.price_l2 = price_l2;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getPrice(Character c) {
        return c == '1' ? price_l1 : price_l2;
    }
}
