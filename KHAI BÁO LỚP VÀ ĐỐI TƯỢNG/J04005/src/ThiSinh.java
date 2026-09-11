package J04005;

public class ThiSinh {
    private String name;
    private String dateOfBirth;
    float d1, d2, d3;
    public ThiSinh(String name, String dateOfBirth, float d1, float d2, float d3) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public String toString() {
        return this.name + " " + this.dateOfBirth + " " + (this.d1 + this.d2 + this.d3);
    }
}
