import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07016 {
    public static boolean[] prime = new boolean[10005];
    public static int[] d1 = new int[10005];
    public static int[] d2 = new int[10005];
    public static void sieve() {
        for (int i = 0 ; i <= 10000 ; i++) prime[i] = true;
        for (int i = 2 ; i * i <= 10000 ; i++) {
            if (prime[i]) {
                for (int j = i * i ; j <= 10000 ; j += i) prime[j] = false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        sieve();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        ois1.close();
        ois2.close();
        for (Integer x : a1) if (prime[x]) d1[x]++;
        for (Integer x : a2) if (prime[x]) d2[x]++;
        for (int i = 2 ; i <= 10000 ; i++) {
            if (d1[i] > 0 && d2[i] > 0) {
                System.out.printf("%d %d %d\n", i, d1[i], d2[i]);
            }
        }
    }
}
