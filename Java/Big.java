/*In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680
Explanation
1254+20
1254*20
*/
import java.util.*;
class B{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    BigInteger b1=new BigInteger(sc.nextInt());
    BigInteger b2=new BigInteger(sc.nextInt());
    BigInteger b3,b4;
    b3=b1.add(b2);
    b4=b1.multiply(b2);
    System.out.println(b3);
    System.out.println(b4);
  }
}
