package Day2;
import java.util.Scanner;

public class binary_to_decimal {

    public static boolean checkbinary(int n){

        int r;
        while (n!=0){
            r = n % 10;
            n = n / 10;
            if ((r !=0) && (r!=1)){
                return false;
            }

        }
        return true;
    }

    public static int decimal(int num){
        int dec = 0,rem, i=0;

        while (num!=0){
            rem = num % 10;
            num = num/10;

            dec += rem * Math.pow(2,i);
            i++;

        }

        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number in binary form : ");
        int n = sc.nextInt();

        boolean flag = checkbinary(n);

        if (flag){
            int d = decimal(n);

            System.out.println("The decimal of "+n+" is : "+d);
        }
        else {
            System.out.println("Your Binary Digit is not Correct");
        }
    }
}
