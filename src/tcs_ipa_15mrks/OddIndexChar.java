package tcs_ipa_15mrks;

import java.util.*;
public class OddIndexChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.length());
        for(int a = 0 ; a< input.length(); a++){
            if(a%2 != 0){
                System.out.print(input.charAt(a));
            }
        }
    }
}

