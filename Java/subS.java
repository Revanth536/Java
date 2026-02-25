/*
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :



*/




import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String small=s.substring(0,k);
        String large=s.substring(0,k);
      for(int i=1;i<s.length()-k;i++){
        String c=s.substring(i,i+k);
        if(c.compareTo(small)<0)
          small=c;
        if(c.compareTo(large)>0)
          large=c;
      }
      return small+"\n"+large;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
