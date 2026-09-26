package J05074;

public class Status {
    private String id, status, tt;
    private SinhVien sv;
    public int score;
    public Status(String id, String status, SinhVien sv) {
        this.id = id;
        this.status = status;
        this.sv = sv;
        this.score = solve();
        this.tt = score > 0 ? "" : "KDDK";
    }
    private int solve() {
        int d = 10;
        for (int i = 0 ; i < status.length() ; i++) {
            if (status.charAt(i) == 'v') d -= 2;
            else if (status.charAt(i) == 'm') d--;
        }
        return d > 0 ? d : 0;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %s", id, sv.getName(), sv.getGrade(), score, tt);
    }
}
