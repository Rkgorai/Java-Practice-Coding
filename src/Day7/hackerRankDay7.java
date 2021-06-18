package Day7;
/**
 * Task
 * Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.
 *
 * Example
 *
 * A = [1,2,3,4]
 * Print 4 3 2 1. Each integer is separated by one space.
 *
 * Input Format
 *
 * The first line contains an integer,  (the size of our array).
 * The second line contains  space-separated integers that describe array 's elements.
 *
 * Constraints
 *
 * Constraints
 *
 * , where  is the  integer in the array.
 * Output Format
 *
 * Print the elements of array  in reverse order as a single line of space-separated numbers.
 *
 * Sample Input
 *
 * 4
 * 1 4 3 2
 * Sample Output
 *
 * 2 3 4 1
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



public class hackerRankDay7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        for (int i = n-1; i>=0; i--){

//            array[n-i] = arr[i];
            System.out.print(arr.get(i)+" ");
        }

        bufferedReader.close();
    }
}
