import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] name = s.trim().split(" +");
            name[0] = name[0].toUpperCase();
            for (int i = 1 ; i < name.length ; i++) {
                String x = name[i];
                x = x.toLowerCase();
                x = Character.toUpperCase(x.charAt(0)) + x.substring(1);
                name[i] = x;
            }
            for (int i = 1 ; i < name.length ; i++) {
                if (i != name.length - 1) {
                    System.out.printf("%s ", name[i]);
                }
                else {
                    System.out.printf("%s, %s\n", name[i], name[0]);
                }
            }
        }
    }
}
