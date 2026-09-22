package J06001;

public class SanPham {
    private String id, name;
    private long p1, p2;
    public SanPham(String id, String name, long p1, long p2) {
        this.id = id;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getPrice(Character x) {
        return x == '1' ? p1 : p2;
    }
}
