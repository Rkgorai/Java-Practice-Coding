package Day6;

/**
 * Task
 * Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).
 *
 * Note:  is considered to be an even index.
 *
 * Example
 *
 *
 * Print abc def
 *
 * Input Format
 *
 * The first line contains an integer,  (the number of test cases).
 * Each line  of the  subsequent lines contain a string, .
 *
 * Constraints
 *
 * Output Format
 *
 * For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.
 *
 * Sample Input
 *
 * 2
 * Hacker
 * Rank
 * Sample Output
 *
 * Hce akr
 * Rn ak
 * Explanation
 *
 * Test Case 0:
 *S = "Hacker"
 *
 *Output
 *Hce akr
 *
 *
 * The even indices are , , and , and the odd indices are , , and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
 *
 * Test Case 1:
 *S = "Rank"
 *
 *Output
 * Rn ak
 *
 * The even indices are  and , and the odd indices are  and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
 */

import java.util.Scanner;

public class hackerRankDay6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<x; i++){
            String S = sc.nextLine();

            for (int j = 0; j<S.length(); j+=2){

                System.out.print(S.charAt(j));
            }

            System.out.print(" ");

            for (int j = 1; j<S.length(); j+=2){

                System.out.print(S.charAt(j));
            }
            System.out.println();
        }

    }
}
