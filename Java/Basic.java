package Java;

import java.util.*;

class Basic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a + b);

        // Printing number with camma
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int c = 0;
        for (int i = n; i <= n1; i++) {
            if (c==0) {
                System.out.print(i + " ");
                c++;
            }
            else
                System.out.print(","+i);
        }
    }
}