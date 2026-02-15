package Java;
// Reverse array

// Find second largest

// Remove duplicates

// Rotate array

// Two sum

// Sort array

import java.util.*;
import java.util.stream.Stream;

class Arrays1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for(int i=0;i<n;i++)
        //     a[i] = sc.nextInt();
        // System.out.println(Arrays.toString(a));

        // Reverse Array
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for(int i=0;i<n;i++)
        //     a[i] = sc.nextInt();
        // for(int i=a.length-1;i>=0;i--)
        //     System.out.print(a[i]+" ");
        // Integer a[] = { 4, 5, 6, 7, 8 };
        // Collections.reverse(Arrays.asList(a));
        // System.out.println(Arrays.toString(a));

        // Find second largest
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for(int i=0;i<n;i++)
        //     a[i] = sc.nextInt();
        // Arrays.sort(a);
        // System.out.println(a[a.length-2]);

        // Remove duplicates
        // using StreamAPI
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for(int i=0;i<n;i++)
        //     a[i] = sc.nextInt();
        // int b[] = Arrays.stream(a).distinct().toArray();
        // System.out.println(Arrays.toString(b));
        // Integer a[] = { 4, 5, 6, 7, 8, 4, 5 };
        // Set<Integer> set = new LinkedHashSet<>(Arrays.asList(a));
        // System.out.println(set);

        // Sort array
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        // for (int i = 0; i < a.length - 1; i++) {
        //     for (int j = 0; j < a.length - 1 - i; j++) {
        //         if (a[j] > a[j + 1]) {
        //             int t = a[j];
        //             a[j] = a[(j + 1)] + a[j] - (a[j + 1] = a[j]);
        //         }
        //     }

        // }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}