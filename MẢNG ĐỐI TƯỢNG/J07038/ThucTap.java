package J07038;

public class ThucTap implements Comparable<ThucTap> {
    private String msv, mdn;
    private SinhVien sv;
    private DoanhNghiep dn;
    public ThucTap(String msv, String mdn, SinhVien sv, DoanhNghiep dn) {
        this.msv = msv;
        this.mdn = mdn;
        this.sv = sv;
        this.dn = dn;
    }
    public DoanhNghiep getDn() {
        return dn;
    }
    @Override
    public int compareTo(ThucTap that) {
        return this.sv.getId().compareTo(that.sv.getId());
    }
    @Override
    public String toString() {
        return sv.getId() + " " + sv.getName() + sv.getGrade();
    }
}
