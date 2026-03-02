// Ṭo find a given number is prime are not
import java.util.*;
import java.math.*;
class B{
  public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
   BigInteger n=sc.nextBigInteger();
    System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
  }
}
