import java.io.*;

public class b24dccn186 {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] d = new int[1005];
        for (int i = 0 ; i < 100000 ; i++) {
            int x = dis.readInt();
            d[x]++;
        }
        for (int i = 0 ; i <= 1000 ; i++) {
            if (d[i] > 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
