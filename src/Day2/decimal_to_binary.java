package Day2;

import java.util.Scanner;

/**
 * Convert a decimal no into binary
 */


public class decimal_to_binary {
    public static String binary(int num){

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
        return binary;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number in decimal form : ");
        int n = sc.nextInt();

        String bin = binary(n);

        System.out.println("The binary of "+n+" is : "+bin);

    }
}
