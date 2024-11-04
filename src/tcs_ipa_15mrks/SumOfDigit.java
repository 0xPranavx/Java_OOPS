package tcs_ipa_15mrks;

import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int output = 0 ;
        while(input != 0){
            int last_digit = input % 10 ;
            output += last_digit;
            input = input /10;
        }
     if(output %3 == 0){
         System.out.println("TRUE");

     }
     else{
         System.out.println("FALSE");
     }


    }
}
