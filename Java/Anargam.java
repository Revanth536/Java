// example :madadm after reverse if the revese string is same then it is Anargam

import java.util.*;
class S{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String rev="";
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      rev=ch+rev;
    }
    if(rev.equals(s))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
