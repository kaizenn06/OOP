package J05026;

public class GiangVien {
    private String id, name, subject;
    public GiangVien(int id, String name, String subject) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.subject = take(subject);
    }
    public String take(String name) {
        String[] subject = name.trim().toUpperCase().split("\\s+");
        String sbj = "";
        for (String x : subject) sbj += x.charAt(0);
        return sbj;
    }
    public String getSubject() { return subject; }
    @Override
    public String toString() {
        return id + " " + name + " " + subject;
    }
}
