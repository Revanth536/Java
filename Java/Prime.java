package Java;
import java.util.*;
public class Prime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //To check Single Prime Number
        // int n = sc.nextInt(),fc=0;
        // for (int i = 1; i <= n; i++) {
        //     if (n% i == 0)
        //         fc++;
        // }
        // if(fc==2)
        //     System.out.println("Prime");
        // else
        //     System.out.println("Not a Prime");

        // To Find Prime Number in a Range
        // int n = sc.nextInt();
        // int n1 = sc.nextInt();
        // for (int i = n; i <= n1; i++) {
        //     int fc = 0;
        //     for (int j = 1; j <= i; j++) {
        //         if (i % j == 0) 
        //             fc++;
        //     }
        //     if(fc==2)
        //         System.out.print(i+" ");
        // }

        // Sum of prime numbers in a range
        // int n = sc.nextInt();
        // int n1 = sc.nextInt(), sum = 0;
        // for (int i = n; i <= n1; i++) {
        //     int fc = 0;
        //     for (int j = 1; j <= i; j++) {
        //         if (i % j == 0)
        //             fc++;
        //     }
        //     if (fc == 2)
        //         sum += i;
            
        // }System.out.println(sum);

        // To find avernage of prime numbers in a range
        int n = sc.nextInt();
        int n1 = sc.nextInt(), sum = 0, count = 0;
        for (int i = n; i <= n1; i++) {
            int fc = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    fc++;
            }
            if (fc == 2) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum+" "+count);
        System.out.println(sum / count);
        
    }
}
