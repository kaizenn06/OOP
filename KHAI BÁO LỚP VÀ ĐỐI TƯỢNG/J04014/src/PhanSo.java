package J04014;

public class PhanSo {
    private long tu, mau;
    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, (a % b));
    }
    public void rutgon() {
        long g = gcd(this.tu, this.mau);
        this.tu /= g;
        this.mau /= g;
    }
    public PhanSo add(PhanSo a) {
        long t = this.tu * a.mau + a.tu * this.mau;
        long m = this.mau * a.mau;
        return new PhanSo(t, m);
    }
    public PhanSo mul(PhanSo a) {
        return new PhanSo(this.tu * a.tu, this.mau * a.mau);
    }
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
