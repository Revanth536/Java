import java.util.*;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int n = sc.nextInt(),rev=0,t=n;
    while(n>0)
    {
        int r = n % 10;
        rev = rev * 10 + r;
        n = n / 10;
    }
    if(rev==t)
        System.out.println("Palindrome");
    else
        System.out.println("Not a Palindrome");
    }
    
}
