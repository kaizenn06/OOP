package J04003;

public class PhanSo {
    private long tu;
    private long mau;  
    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, (a % b));
    }
    public String toString() {
        long t = gcd(this.tu, this.mau);
        return (this.tu / t) + "/" + (this.mau / t);
    }
}
