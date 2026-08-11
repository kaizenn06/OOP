import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            long n = sc.nextLong();
            long ans = 1, sum = 0;
            boolean check = true;
            while(n != 0) {
                int t = (int)(n % 10);
                switch(t) {
                    case 0:
                    case 8: 
                    case 9:
                        t = 0;
                        break;
                    case 1:
                        t = 1;
                        break;
                    default:
                        check = false;
                        break;
                }
                sum = t * ans + sum;
                ans *= 10;
                n /= 10;
            }
            if(sum == 0) check = false;
            System.out.println(check ? sum : "INVALID");
        }
    }
}
