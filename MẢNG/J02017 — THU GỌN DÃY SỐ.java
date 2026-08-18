import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < n ; i++) {
            int x = sc.nextInt();
            if (!stack.empty() && stack.peek() % 2 == x % 2) {
                stack.pop();
            }
            else stack.push(x);
        }
        System.out.println(stack.size());
    }
}
