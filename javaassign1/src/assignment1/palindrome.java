
package assignment1;

import java.util.Scanner;
public class palindrome {
    static boolean isPalindrome(String str){
        String rev=new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
