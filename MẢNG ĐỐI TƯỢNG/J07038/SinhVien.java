package J07038;

public class SinhVien {
    private String id, name, grade, email;
    public SinhVien(String id, String name, String grade, String email) {
        this.id = id;
        this.name = CH(name.trim().toLowerCase());
        this.grade = grade;
        this.email = email;
    }
    private String CH(String key) {
        StringBuilder s = new StringBuilder();
        String[] name = key.split("\\s+");
        for (String x : name) {
            s.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return s.toString();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }
}
