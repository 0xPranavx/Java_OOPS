package tcs_ipa_15mrks;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
         int a = 0 ;
         int b = input.length() -1;

         while(a < b){
             if(input.charAt(a) != input.charAt(b)){
                 System.out.println("not a palindrome");
                 break;
             }
             a++;
             b--;
         }

         System.out.println("palindrome");



    }
}


