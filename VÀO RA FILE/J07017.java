package J07017;

import java.util.*;
import java.io.*;

class Pair <K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public boolean is_prime(int n) {
        for (int i = 2 ; i * i <= n ; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    public boolean isPrime() {
        if (key instanceof Integer && value instanceof Integer) {
            int k = (Integer) key;
            int v = (Integer) value;
            return is_prime(k) && is_prime(v);
        }
        return false;
    }
    public String toString() {
        return key + " " + value;
    }
}

public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
