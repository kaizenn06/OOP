package J04004;

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
    public PhanSo add(PhanSo x) {
        long t = this.tu * x.mau + x.tu * this.mau;
        long m = this.mau * x.mau;
        PhanSo tong = new PhanSo(t, m);
        tong.rutgon();
        return tong;
    }
    public void rutgon() {
        long t = gcd(Math.abs(this.tu), Math.abs(this.mau));
        this.tu = this.tu / t;
        this.mau = this.mau / t;
    }
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
