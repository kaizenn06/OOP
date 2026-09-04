import java.io.*;
import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] d = new int[1005];
        while (sc.hasNext()) {
            int x = sc.nextInt();
            d[x]++;
        }
        for (int i = 0 ; i <= 1000 ; i++) {
            if (d[i] > 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
