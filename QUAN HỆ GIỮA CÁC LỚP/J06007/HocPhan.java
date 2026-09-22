package J06007;

public class HocPhan {
    private String id_gv, id_mh;
    private double total_time;
    public HocPhan(String id_gv, String id_mh, double total_time) {
        this.id_gv = id_gv;
        this.id_mh = id_mh;
        this.total_time = total_time;
    }
    public String getId_gv() {
        return id_gv;
    }
    public double getTotal_time() {
        return total_time;
    }
}
