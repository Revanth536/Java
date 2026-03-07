import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	LinkedList<Integer> l=new LinkedList<>();
	for(int i=0;i<n;i++)
	    l.add(sc.nextInt());
	int Q=sc.nextInt();
	for(int i=0;i<Q;i++){
	    String s=sc.next();
	    if(s.equals("Insert")){
	        int n1=sc.nextInt();
	        int v=sc.nextInt();
	        l.add(n1,v);
	    }else{
	        int d=sc.nextInt();
	        l.remove(d);
	    }
	}
	for(Integer s: l)
	    System.out.print(s+ " ");
	    
	}
}
