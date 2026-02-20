package Java;
import java.util.*;
public class Method {
    static Scanner sc = new Scanner(System.in);

    int add(int a, int b) {
        return a + b;
    }

    boolean Isprime(int n) {
        int fc = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                fc++;
            }
        }
        if(fc == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt(), n1 = sc.nextInt();
        Method m = new Method();
        // System.out.println(m.add(n, n1));
        System.out.print(n + " is ");
        if(m.Isprime(n)) {
            System.out.print("a prime number");
        }
        else {
            System.out.print("not a prime number");
        }

    }
}
