import java.util.Scanner;

public class b24dccn186 {

    static boolean check(String s, int n) {
        String temp = String.valueOf(n);
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != '?' && s.charAt(i) != temp.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String operator = sc.next();
            String b = sc.next();
            String equal = sc.next();
            String c = sc.next();
            boolean found = false;
            for (int i = 10 ; i < 100 && !found ; i++) {
                if(!check(a, i)) continue;
                for (int j = 10 ; j < 100 && !found ; j++) {
                    if(!check(b, j)) continue;
                    for (char op : new char[]{'+', '-', '*', '/'}) {
                        if(!operator.equals("?") && operator.charAt(0) != op) {
                            continue;
                        }
                        int res = 0;
                        switch(op) {
                            case '+':
                                res = i + j;
                                break;
                            case '-':
                                res = i - j;
                                break;
                            case '*':
                                res = i * j;
                                break;
                            case '/':
                                if(i % j != 0) continue;
                                res = i / j;
                                break;
                        }   
                        if(res >= 10 && res < 100 && check(c , res)) {
                            System.out.printf("%d %c %d = %d", i, op, j, res);
                            found = true;
                            break;
                        }
                    }
                }
            }
            if(!found) {
                System.out.print("WRONG PROBLEM!");
            }
            System.out.println();
        }
    }
}
