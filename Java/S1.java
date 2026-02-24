// if we give two strings 
//  sample Input
// hello
// world
// Expected output
// 9
// No(if a is greater than B then yes else No)
// Hello Java
import java.util.*;
class S{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    String s=sc.next();
    String s1=sc.next();

    String cA=s.substring(0,1).ToUpperCase().s.substring(1);
    String cB=s1.substring(0,1).ToUpperCase().s1.substring(1);

    System.out.println(s.length()+s1.length());
    if(s.compareTo(s1)>0)
      System.out.println("Yes");
    else
      System.out.println("No");
    System.out.println(cA+" "+cB);
  }
}
