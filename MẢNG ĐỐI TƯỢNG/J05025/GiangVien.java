package J05025;

public class GiangVien implements Comparable<GiangVien> {
    private String id, name, last_name, subject;
    public GiangVien(int id, String name, String subject) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.last_name = from(name);
        this.subject = take(subject);
    }
    public String from(String full_name) {
        String[] name = full_name.trim().split("\\s+");
        StringBuilder last_name = new StringBuilder();
        last_name.append(name[name.length - 1]);
        return last_name.toString();
    }
    public String take(String subject) {
        String[] sbj = subject.trim().toUpperCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : sbj) {
            res.append(x.charAt(0));
        }
        return res.toString();
    }
    @Override
    public int compareTo(GiangVien that) {
        if (this.last_name.compareTo(that.last_name) != 0) {
            return this.last_name.compareTo(that.last_name);
        }
        return this.id.compareTo(that.id);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, subject);
    }
}
