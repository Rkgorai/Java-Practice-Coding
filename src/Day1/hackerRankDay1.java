package Day1;


import java.io.*;
import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;

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