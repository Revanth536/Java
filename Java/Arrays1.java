package Java;
// Reverse array

// Find second largest

// Remove duplicates

// Rotate array

// Two sum

// Sort array

import java.util.*;

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
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}