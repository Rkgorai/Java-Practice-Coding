package Day1;
/**
 * Perform Addition, Subtraction, Multiplication and division by taking 2 int input and the operator
 */

import java.util.Scanner;

public class Calculator {

    public static int calculate(int a, int b, char op){
        int res = 0;

        switch (op){
            case '+':
                res = a+b;
                break;
            case '-':
                res = a-b;
                break;
            case '*':
                res = a*b;
                break;
            case '/':
                res = a/b;
                break;
            default:
                System.out.println("Operator is not +,-,*,/");
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int y = sc.nextInt();
        System.out.print("Enter the Operator (+,-,*,/) : ");
        char z = sc.next().charAt(0);

        int result = calculate(x, y, z);
        System.out.println("The result is : "+result);
    }
}
