package J05064;

public class GiaoVien {
    private String id, name;
    private long salary_hs, salary_cb, pc, total_salary;
    public GiaoVien(String id, String name, long salary_cb) {
        this.id = id;
        this.name = name;
        this.salary_hs = Long.parseLong(id.substring(2));
        this.salary_cb = salary_cb;
        this.pc = PC();
        this.total_salary = this.salary_cb * this.salary_hs + this.pc;
    }
    private int PC() {
        String key = id.substring(0, 2);
        if (key.equals("HT")) return 2000000;
        else if (key.equals("HP")) return 900000;
        else return 500000;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", id, name, salary_hs, pc, total_salary);
    }
}
