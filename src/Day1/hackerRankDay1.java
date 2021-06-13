package Day1;
/**Objective
 Today, we're discussing data types. Check out the Tutorial tab for learning materials and an instructional video!

 Task
 Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

 Declare  variables: one of type int, one of type double, and one of type String.
 Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
 Use the  operator to perform the following operations:
 Print the sum of  plus your int variable on a new line.
 Print the sum of  plus your double variable to a scale of one decimal place on a new line.
 Concatenate  with the string you read as input and print the result on a new line.
 Note: If you are using a language that doesn't support using  for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

 Input Format

 The first line contains an integer that you must sum with .
 The second line contains a double that you must sum with .
 The third line contains a string that you must concatenate with .

 Output Format

 Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

 Sample Input

 12
 4.0
 is the best place to learn and practice coding!
 Sample Output

 16
 8.0
 HackerRank is the best place to learn and practice coding!
 Explanation

 When we sum the integers  and , we get the integer .
 When we sum the floating-point numbers  and , we get .
 When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!.

 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRankDay1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int x;
        double y;
//        String z;
        /* Read and save an integer, double, and String to your variables.*/
        x = scan.nextInt();
        System.out.println("X taken");
        y = scan.nextDouble();
        System.out.println("y taken");
        scan.nextLine();
        String z5 = scan.nextLine() ;
        System.out.println("z taken");
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        x += i;
        System.out.println(x);


        /* Print the sum of the double variables on a new line. */
        y = y + d;
        System.out.println(y);


        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        // z = "How";
        z5 = s.concat(z5);
        System.out.println(z5);
        scan.close();
    }
}