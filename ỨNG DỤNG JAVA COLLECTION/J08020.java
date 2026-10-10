import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0 ; i < s.length() ; i++) {
                Character c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.add(c);
                }
                else if (!stack.empty()){
                    if (c == ')' && stack.peek() == '(') stack.pop();
                    if (c == ']' && stack.peek() == '[') stack.pop();
                    if (c == '}' && stack.peek() == '{') stack.pop();
                }
            }
            System.out.println(stack.empty() ? "YES" : "NO");
        }
    }
}
