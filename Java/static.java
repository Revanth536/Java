import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code here
 static Scanner sc=new Scanner(System.in);
 static int B,H;
 static boolean flag;
 static{
    B=sc.nextInt();
    H=sc.nextInt();
    if(H>0 && B>0)
        flag=true;
    else
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    
 }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

