package J06008;

public class HocPhan {
    private String id_gv, id_mh;
    private double total_time;
    private MonHoc mh;
    private GiangVien gv;
    public HocPhan(String id_gv, String id_mh, double total_time, MonHoc mh, GiangVien gv) {
        this.id_gv = id_gv;
        this.id_mh = id_mh;
        this.total_time = total_time;
        this.mh = mh;
        this.gv = gv;
    }
    public String getId_gv() {
        return id_gv;
    }
    public double getTotal_time() {
        return total_time;
    }
    public GiangVien getGv() {
        return gv;
    }
    @Override
    public String toString() {
        return mh.getName() + " " + total_time;
    }
}
