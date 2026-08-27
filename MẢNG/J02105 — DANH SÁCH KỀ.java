import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            a.add(new ArrayList<>());
            for (int j = 0 ; j < n ; j++) {
                int x = sc.nextInt();
                if (x == 1) {
                    a.get(i).add(j + 1);
                }
            }
        }
        for (int i = 0 ; i < a.size() ; i++) {
            System.out.printf("List(%d) = ", i + 1);
            for (int j = 0 ; j < a.get(i).size() ; j++) {
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }       
    }
}
