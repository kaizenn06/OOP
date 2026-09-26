package J05069;

public class Squad {
    private String id, name;
    private long price;
    public Squad(String id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getPrice() {
        return price;
    }
}
