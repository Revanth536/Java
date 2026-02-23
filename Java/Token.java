// [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. 
// Then, print the number of tokens, followed by each token on a new line.
// He is a very very good boy, isn't he?
// sammple output
// 10
// He
// is
// a
// very
// very
// good
// boy
// isn
// t
// he
import java.util.*;
class Tk{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    String s=sc.nextLine();
    List<String> strlist=new ArrayList<>();
     for(String ss : s.split("[\\s!,?._'@]+"))
            if(ss.matches("[A-Za-z]+"))
                strlist.add(ss);
        System.out.println(strlist.size());
    Iterator i =strlist.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
  }
}
