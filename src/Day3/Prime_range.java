package Day3;
import java.util.Scanner;

/**
 * Write a program to show the numbers which are prime in a given range
 */
public class Prime_range {
    public static boolean prime(int num){
        for(int i = 2; i<num; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the staring of range: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the ending of range : ");
        int n2 = sc.nextInt();

        if (n1<n2){
            for (int i = n1; i <= n2; i++) {
                boolean x = prime(i);
                if (x) {
                    System.out.print(i + "\t");
                }

            }
        }else {
            System.out.println("Enter Valid Range");
        }


//        boolean testcase1 = prime(22);
//        boolean testcase2 = prime(13);
//        boolean testcase3 = prime(33);
//        boolean testcase4 = prime(61);
//
//        System.out.println(testcase1);
//        System.out.println(testcase2);
//        System.out.println(testcase3);
//        System.out.println(testcase4);
    }
}
