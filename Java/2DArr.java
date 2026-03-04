/*You are given a  2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

The hourglass which has the largest sum is:

2 4 4
  2
1 2 4*/ 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        List<Integer> results =new ArrayList<>();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                int mid=arr.get(i).get(j);
                int t1=arr.get(i-1).get(j-1);
                int t2=arr.get(i-1).get(j);
                int t3=arr.get(i-1).get(j+1);
                int b1=arr.get(i+1).get(j-1);  
                int b2=arr.get(i+1).get(j);
                int b3=arr.get(i+1).get(j+1);
                int sum =t1+t2+t3+mid+b1+b2+b3;
                results.add(sum);              
            }
        }
        int result =Collections.max(results);
        System.out.println(result);
        bufferedReader.close();
    }
}
