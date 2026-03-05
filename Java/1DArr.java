/*Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse
Returns

boolean: true if the game can be won, otherwise false
Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls).
The  subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
Constraints

It is guaranteed that the value of  is always .
Sample Input

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
Explanation

We perform the following  queries:

For  and , we can walk and/or jump to the end of the array because every cell contains a . Because we can win, we return true.
For  and , we can walk to index  and then jump  units to the end of the array. Because we can win, we return true.
For  and , there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For  and , there is no way for us to get past the one at index . Because we cannot win, we return false.
Language
Java 7
More
111213141516171819202122232425262728293031323334
import java.util.*;
import java.io.*;

public class Solution {
    private static boolean check(int i,int leap,int[] arr){
        if(i<0 || arr[i]==1) return false;
        if(i+leap>=arr.length || i==arr.length-1) return true;
        arr[i]=1;
        
        return check(i+leap,leap,arr)||

45public class Solution {    private static boolean check(int i,int leap,int[] arr){
Line: 2 Col: 13

Test against custom input
Java
You have earned 25.00 points!
34/64 challenges solved.
53%
Congratulations
You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn

Test case 0

Test case 1

Test case 2

Test case 3

Test case 4

Test case 5

Test case 6

Test case 7

Test case 8

Test case 9
Compiler Message
Success
Input (stdin)
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
Expected Output
YES
YES
NO
NO
*/ 

import java.util.*;
import java.io.*;

public class Solution {
    private static boolean check(int i,int leap,int[] arr){
        if(i<0 || arr[i]==1) return false;
        if(i+leap>=arr.length || i==arr.length-1) return true;
        arr[i]=1;
        
        return check(i+leap,leap,arr)||
        check(i+1,leap,arr)||
        check(i-1,leap,arr);
    }

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int leap=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(Solution.check(0,leap,arr)?"YES":"NO");
             
            
        }
        
    }
}

