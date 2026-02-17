package Java;

import java.util.Scanner;

public class Amst {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int t = n,c=0,sum=0;
        while (t > 0) {
            c++;
            t/=10;
        }
        t = n;
        while (t > 0) {
            int r = t % 10;
            int pow = (int)Math.pow(r, c);
            sum += pow;
            t /= 10;
        }
        if(sum==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not an Armstrong");

       

    }
}
