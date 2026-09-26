package J05024;

public class SinhVien {
    private String id, name, grade, email, specialized;
    public SinhVien(String id, String name, String grade, String email) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.specialized = "";
    }
    public String getGrade() { return grade; }
    public String getSpecialized() {
        String spc = id.substring(3,7);
        if (spc.equals("DCKT")) specialized = "KE TOAN";
        else if (spc.equals("DCCN")) specialized = "CONG NGHE THONG TIN";
        else if (spc.equals("DCAT")) specialized = "AN TOAN THONG TIN";
        else if (spc.equals("DCVT")) specialized = "VIEN THONG";
        else if (spc.equals("DCDT")) specialized = "DIEN TU";
        return specialized;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, grade, email);
    }
}
