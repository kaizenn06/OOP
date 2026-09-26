package J07038;

public class DoanhNghiep {
    private String id, name;
    private int quantity;
    public DoanhNghiep(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
}
