package tcs_ipa_15mrks;

import java.util.*;
public class FindCharIndexInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char ch = sc.next().charAt(0);
        int output = input.indexOf(ch);

        System.out.println(output);


    }
}
