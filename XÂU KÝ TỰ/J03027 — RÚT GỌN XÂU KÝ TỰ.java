import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (!stack.empty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            else stack.add(s.charAt(i));
        }
        if (stack.empty()) {
            System.out.println("Empty String");
        }
        else {
            for (char x : stack) {
                System.out.print(x);
            }
        }
    }
}
