package J04020;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    private boolean check_prime(int n) {
        for (int i = 2 ; i * i <= n ; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    public boolean isPrime() {
        int a = (Integer) first;
        int b = (Integer) second;
        return check_prime(a) && check_prime(b);
    }
    @Override
    public String toString() {
        return first + " " + second;
    }
}
