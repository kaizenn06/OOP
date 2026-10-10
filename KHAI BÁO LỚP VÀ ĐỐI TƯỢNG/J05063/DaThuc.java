package J05063;

public class DaThuc {
    private int[] arr = new int[10005];
    public DaThuc(int[] arr) {
        this.arr = arr;
    }
    public DaThuc(String s) {
        String[] dt = s.trim().split("\\s*\\+\\s*");
        for (String x : dt) {
            String[] num = x.split("\\*x\\^|x\\^");
            arr[Integer.parseInt(num[1])] += Integer.parseInt(num[0]);
        }
    }
    public DaThuc cong(DaThuc that) {
        int[] dathuc = new int[10005];
        for (int i = 0 ; i <= 10000 ; i++) {
            if (this.arr[i] != 0 || that.arr[i] != 0) {
                dathuc[i] += (this.arr[i] + that.arr[i]);
            }
        }
        return new DaThuc(dathuc);
    }
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 10000 ; i >= 0 ; i--) {
            if (arr[i] != 0) {
                if (res.length() > 0) res.append(" + ");
                res.append(arr[i]).append("*x^").append(i);
            }
        }
        return res.toString();
    }
}
