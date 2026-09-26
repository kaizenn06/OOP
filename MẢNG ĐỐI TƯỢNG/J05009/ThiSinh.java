package J05009;

public class ThiSinh {
    private int id;
    private String name, date;
    private double d1, d2, d3, total;
    public ThiSinh(int id, String name, String date, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.total = d1 + d2 + d3;
    }
    public double getTotal() {
        return this.total;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + date + " " + total;
    }
}

