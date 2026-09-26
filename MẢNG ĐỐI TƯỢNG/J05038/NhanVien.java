package J05038;

public class NhanVien {
    private String id, name, regency;
    private long salary_month, bonus, pc, salary_total;
    public NhanVien(int id, String name, long salary_cb, long days, String regency) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.salary_month = salary_cb * days;
        if (days >= 25) this.bonus = this.salary_month * 20 / 100;
        else if (days >= 22) this.bonus = this.salary_month * 10 / 100;
        else this.bonus = 0;
        if (regency.equals("GD")) this.pc = 250000;
        else if (regency.equals("PGD")) this.pc = 200000;
        else if (regency.equals("TP")) this.pc = 180000;
        else if (regency.equals("NV")) this.pc = 150000;
        this.salary_total = this.salary_month + this.bonus + this.pc;
    }
    public long getSalary_total() { return salary_total; }
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", id, name, salary_month, bonus, pc, salary_total);
    }
}
