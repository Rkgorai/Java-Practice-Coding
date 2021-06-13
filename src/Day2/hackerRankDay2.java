package Day2;
/**
Objective
        In this challenge, you will work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video.

        Task
        Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

        Example



        A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.

        Function Description
        Complete the solve function in the editor below.

        solve has the following parameters:

        int meal_cost: the cost of food before tip and tax
        int tip_percent: the tip percentage
        int tax_percent: the tax percentage
        Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

        Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

        Input Format
        There are  lines of numeric input:
        The first line has a double,  (the cost of the meal before tax and tip).
        The second line has an integer,  (the percentage of  being added as tip).
        The third line has an integer,  (the percentage of  being added as tax).

        Sample Input

        12.00
        20
        8
        Sample Output

        15

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

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double x;

        x = meal_cost + (tip_percent * 0.01)* meal_cost + (tax_percent * 0.01)* meal_cost;

        int total = (int)Math.round(x);

        System.out.println(total);
    }

}

public class hackerRankDay2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

