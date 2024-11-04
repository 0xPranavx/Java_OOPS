package tcs_ipa_15mrks;

import java.util.*;
public class CharAtOddIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        String output = "";
        for(int a = 0 ; a<input.length(); a++){
            if(a %2 != 0){
               output += input.charAt(a);

            }
        }
        System.out.println(output);
    }
}
