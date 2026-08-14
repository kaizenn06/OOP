import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> ds = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] name = s.trim().split(" +");
            for (int i = 0 ; i < name.length ; i++) {
                name[i] = name[i].toLowerCase();
            }
            String email = name[name.length - 1];
            for (int i = 0 ; i < name.length - 1; i++) {
                email += name[i].charAt(0);
            }
            ds.add(email);
        }
        for (int i = 0 ; i < ds.size() ; i++) {
            int dem = 0;
            String name = ds.get(i);
            for (int j = 0 ; j < i ; j++) {
                if(name.equals(ds.get(j))) {
                    dem++;
                }
            }
            if (dem >= 1) {
                System.out.println(name + (dem + 1) + "@ptit.edu.vn");
            }
            else System.out.println(name + "@ptit.edu.vn");
        }
    }
}
