package tcs_ipa_15mrks;

import java.util.Scanner;

public class CountSpaceInString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0 ;
        for(int a = 0 ; a< input.length() ; a++){
            if(input.charAt(a) == ' '){
                count++;
            }

        }
        System.out.println(count);

    }
}
