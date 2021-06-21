package Day10;
/**
 * Task
 * Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.
 *
 * Example
 *
 * The binary representation of  is . In base , there are  and  consecutive ones in two groups. Print the maximum, .
 *
 * Input Format
 *
 * A single integer, .
 *
 * Constraints
 *
 * Output Format
 *
 * Print a single base- integer that denotes the maximum number of consecutive 's in the binary representation of .
 *
 * Sample Input 1
 *
 * 5
 * Sample Output 1
 *
 * 1
 * Sample Input 2
 *
 * 13
 * Sample Output 2
 *
 * 2
 * Explanation
 *
 * Sample Case 1:
 * The binary representation of  is , so the maximum number of consecutive 's is .
 *
 * Sample Case 2:
 * The binary representation of  is , so the maximum number of consecutive 's is .
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class hackerRankDay10 {

    public static int binary(int num){

        //Initializing Array to record the binary bits
        int bin[] =new int[20];
        int i = 0;

        while (num > 0){
            bin[i] = num % 2;
            num = num / 2;
            i++;
        }

        //Convert the bin[] into binary String
        String binary="";
        for (i= i-1;i>=0; i--){
            binary = binary+Integer.toString(bin[i]);
        }
        return count(binary);

    }

    public static int count (String binary){
        int c=0, max = 0;
        System.out.println(binary);
        for (int i = 0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
                c++;
            } else {
                max= Math.max(max, c);
                c=0;
            }
            max= Math.max(max, c);
        }

        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int x = binary(n);

        System.out.println(x);

        bufferedReader.close();
    }
}
