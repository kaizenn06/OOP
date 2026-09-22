package J06003;

public class BaiTL {
    private int id;
    private String title;
    public BaiTL(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Bai tap dang ky: " + title;
    }
}
