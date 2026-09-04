import java.io.*;
import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
            }
            else sc.next();
        }
        System.out.println(sum);
    }
}
