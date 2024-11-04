package tcs_ipa_15mrks;

import java.util.*;
public class CountLowerCaseInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0 ;
        for(int a = 0 ; a<input.length() ; a++){
            if(input.charAt(a) >= 'a' && input.charAt(a) <= 'z' ){
                count++;

            }

        }
        System.out.println(count);
    }
}
