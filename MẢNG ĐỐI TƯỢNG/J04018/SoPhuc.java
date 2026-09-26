package J04018;

public class SoPhuc {
    private int thuc, ao;
    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public SoPhuc add(SoPhuc that) {
        int a = this.thuc + that.thuc;
        int b = this.ao + that.ao;
        return new SoPhuc(a, b);
    }
    public SoPhuc mul(SoPhuc that) {
        int a = this.thuc;
        int b = this.ao;
        int c = that.thuc;
        int d = that.ao;
        return new SoPhuc(a * c - b * d, a * d + b * c);
    }
    public String toString() {
        if (ao < 0) return thuc + " - " + Math.abs(ao) + "i";
        return thuc + " + " + ao + "i";
    }
}
