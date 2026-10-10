import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {
    public static boolean isPrime(Integer n) {
        for (int i = 2 ; i * i <= n ; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    public static int[] d = new int[10005];
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        ois.close();
        for (Integer x : a) {
            if (isPrime(x)) {
                d[x]++;
            }
        }
        for (int i = 2 ; i <= 10000 ; i++) {
            if (d[i] > 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
