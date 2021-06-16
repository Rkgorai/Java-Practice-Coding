package Day4;
import java.util.Scanner;
/**
 * Write a program on 2d-array to print the following pattern –
 * 1
 * 1 0
 * 1 0 1
 * 1 0 1 0
 */

public class Pattern1 {
    public static void pattern(int n){


        for (int i=0; i<n; i++){
            int k = 1;

            for (int j=0; j<=i; j++){

                System.out.print(k+" ");

                if (k==1){
                    k=0;
                } else {
                    k=1;
                }
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
