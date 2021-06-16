package Day4;

/**
 * Write a program on 2d-array to print the following pattern –
 *                  *
 *                * * *
 *               * * * * *
 *             * * * * * * *
 *          * * * * * * * * *
 */

import java.util.Scanner;

public class Pattern2 {

    public static void pattern(int n){

        for (int i = 1; i<=n; i++){

            int k=0;

            //Print Space
            for (int space = 1; space <= n-i; space++){
                System.out.print(" ");
            }

            //Print *
            while (k != 2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows you want to print : ");
        int N = sc.nextInt();

        pattern(N);
    }
}
