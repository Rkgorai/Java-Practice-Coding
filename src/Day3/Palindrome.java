package Day3;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String s) {

        String rev = "";

        for (int i=s.length()-1; i >=0 ; i--){

            rev = rev + s.charAt(i);
        }

        for (int i=s.length()-1; i >= 0; i--){

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(rev.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean flag = palindrome(str);

        if (flag){
            System.out.println(str+ " is a Palindrome");
        } else {
            System.out.println(str+ " is not Palindrome");
        }


//        boolean testcase1 = palindrome("Nitin");
//        boolean testcase2 = palindrome("Raja");
//        boolean testcase3 = palindrome("");
//        boolean testcase4 = palindrome("madam");
//
//
//        System.out.println(testcase1);
//        System.out.println(testcase2);
//        System.out.println(testcase3);
//        System.out.println(testcase4);
    }
}
