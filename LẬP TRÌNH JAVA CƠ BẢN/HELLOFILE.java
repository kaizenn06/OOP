import java.io.*;
import java.util.*;

public class HELLOFILE {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
