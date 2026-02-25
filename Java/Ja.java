/*anagramm
marganaa
Sample Output 1

Not Anagrams*/
import java.util.*;
class Ja{
  public static boolean isAnagram(String a,String b){
    String ar[]= String[] aArr = a.split("");
        String[] bArr = b.split("");
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        
        return String.join("", aArr).equals(String.join("", bArr));
  }
  
  public static void main(String [] args)
  {
    Scanner sc =new Scanner(System.in);
    String a=sc.next().toLowerCase();
    String b=sc.next().toLowerCase();
    boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
