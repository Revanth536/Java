import java.util.*;
public class Method {
    static Scanner sc = new Scanner(System.in);

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int n = sc.nextInt(), n1 = sc.nextInt();
        Method m = new Method();
        System.out.println(m.add(n, n1));

    }
}
