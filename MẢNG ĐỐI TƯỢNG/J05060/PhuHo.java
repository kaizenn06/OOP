package J05060;

public class PhuHo {
    private String id, name, xl;
    private double lt, th, bonus;
    private long age, avg;
    public PhuHo(int id, String name, String date, double lt, double th) {
        this.id = "PH" + String.format("%02d", id);
        this.name = name;
        this.age = 2021 - Integer.parseInt(date.substring(6));
        this.lt = lt;
        this.th = th;
        this.bonus = thuong();
        this.avg = Math.round((lt + th) / 2.0 + bonus);
        if (this.avg > 10) this.avg = 10;
        this.xl = xeploai();
    }
    public double thuong() {
        if (lt >= 8 && th >= 8) return 1;
        else if (lt >= 7.5 && th >= 7.5) return 0.5;
        else return 0;
    }
    public String xeploai() {
        if (avg < 5) return "Truot";
        else if (5 <= avg && avg <= 6) return "Trung binh";
        else if (avg == 7) return "Kha";
        else if (avg == 8) return "Gioi";
        else return "Xuat sac";
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d %s", id, name, age, avg, xl);
    }
}
