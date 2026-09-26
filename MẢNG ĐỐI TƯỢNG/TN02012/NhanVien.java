package TN02012;

public class NhanVien {
    private String id, name;
    private int salary_base, days, hs;
    private long salary_month;
    private PhongBan pb;
    public NhanVien(String id, String name, int salary_base, int days, PhongBan pb) {
        this.id = id;
        this.name = name;
        this.salary_base = salary_base;
        this.days = days;
        this.pb = pb;
        this.hs = solve();
        this.salary_month = salary_base * days * this.hs;
    }
    private int solve() {
        Character key = id.charAt(0);
        int number = Integer.parseInt(id.substring(1,3));
        switch(key) {
            case 'A' :
                if (1 <= number && number <= 3) return 10;
                if (4 <= number && number <= 8) return 12;
                if (9 <= number && number <= 15) return 14;
                if (number >= 16) return 20;
            case 'B' :
                if (1 <= number && number <= 3) return 10;
                if (4 <= number && number <= 8) return 11;
                if (9 <= number && number <= 15) return 13;
                if (number >= 16) return 16;
            case 'C' :
                if (1 <= number && number <= 3) return 9;
                if (4 <= number && number <= 8) return 10;
                if (9 <= number && number <= 15) return 12;
                if (number >= 16) return 14;
            case 'D' :
                if (1 <= number && number <= 3) return 8;
                if (4 <= number && number <= 8) return 9;
                if (9 <= number && number <= 15) return 11;
                if (number >= 16) return 13;
            default: return 0;
        }
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d", id, name, pb.getName(), salary_month * 1000);
    }
}
