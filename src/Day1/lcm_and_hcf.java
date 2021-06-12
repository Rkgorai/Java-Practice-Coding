package Day1;

/**
 * Find the LCM and HCF of two numbers
 */

import java.util.Scanner;

public class lcm_and_hcf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st num : ");
        int n1 = sc.nextInt();

        System.out.print("Enter the 2nd num : ");
        int n2 = sc.nextInt();

        int lcm = Math.max(n1,n2);  //Finds the Maximum of two variable

        //LCM Logic Starts here
        int i = 0;
        while (true){
            if ((lcm % n1 == 0) && (lcm % n2 == 0)){
                System.out.println("LCM of "+n1+" and "+n2+" is : "+lcm);
                break;
            }
            lcm++;
        }

        //HCF Logic Starts here
        int hcf = 1;

        for (i = 1; i <= n1 && i <= n2; i++) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        System.out.println("HCF of " + n1 +" and " + n2 + " is " + hcf);

    }
}
