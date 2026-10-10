import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int max = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for (int i = 0 ; i < s.length() ; i++) {
                if (s.charAt(i) == '(') stack.push(i);
                else {
                    stack.pop();
                    if (stack.empty()) stack.push(i);
                    else {
                        max = Math.max(max, i - stack.peek());
                    }
                }
            }
            System.out.println(max);
        }
    }
}
