package J04015;

public class GiaoVien {
    private String id;
    private String name;
    private long salary;
    private long phucap;
    private long heso;
    private long total;
    public GiaoVien (String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        if (id.charAt(1) == 'T') this.phucap = 2000000;
        else if (id.charAt(1) == 'P') this.phucap = 900000;
        else if (id.charAt(1) == 'V') this.phucap = 500000;
        heso = (id.charAt(2) - '0') * 10 + (id.charAt(3) - '0');
        total = heso * salary + phucap;
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.heso + " " + this.phucap + " " + this.total;
    }
}
