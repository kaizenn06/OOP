import java.util.*;

class HocPhan implements Comparable<HocPhan> {
    private String id, name, nhom, lecturer;
    public HocPhan(String id, String name, String nhom, String lecturer) {
        this.id = id;
        this.name = name;
        this.nhom = nhom;
        this.lecturer = lecturer;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLecturer() {
        return lecturer;
    }
    @Override
    public int compareTo(HocPhan that) {
        if (!this.id.equals(that.id)) {
            return this.id.compareTo(that.id);
        }
        return this.nhom.compareTo(that.nhom);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + nhom;
    }
}


public class test_mdt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HocPhan[] hp = new HocPhan[n];
        for (int i = 0 ; i < n ; i++) {
            hp[i] = new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(hp);
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < m ; i++) {
            String lecturer = sc.nextLine();
            for (int j = 0 ; j < n ; j++) {
                if (hp[j].getLecturer().equals(lecturer)) {
                    System.out.printf("Danh sach cho giang vien %s:\n", hp[j].getLecturer());
                    break;
                }
            }
            for (int j = 0 ; j < n ; j++) {
                if (hp[j].getLecturer().equals(lecturer)) {
                    System.out.println(hp[j]);
                }
            }
        }
    }
}
