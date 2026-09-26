package J05043;

public class NhanVien {
    private String id, name;
    private long pc, salary, loan, remain;
    public NhanVien(int id, String name, String argency, int salary_day, int days) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        if (argency.equals("GD")) this.pc = 500;
        else if (argency.equals("PGD")) this.pc = 400;
        else if (argency.equals("TP")) this.pc = 300;
        else if (argency.equals("KT")) this.pc = 250;
        else this.pc = 100;
        this.salary = salary_day * days;
        if ((this.pc + this.salary) * 2/3 < 25000) this.loan = Math.round(((this.pc + this.salary) * 2.0/3.0) / 1000.0) * 1000;
        else this.loan = 25000;
        this.remain = this.salary  + this.pc - this.loan;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", id, name, pc, salary, loan, remain);
    }
}
