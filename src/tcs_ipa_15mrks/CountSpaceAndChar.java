package tcs_ipa_15mrks;

import java.util.Scanner;

public class CountSpaceAndChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int spaceCount = 0 ;
        int charCount = 0 ;
        for(int a = 0 ; a < input.length(); a++){
            if(input.charAt(a) == ' '){
                spaceCount++ ;
            }
            else{
                charCount++;
            }


        }
        System.out.println(spaceCount + " " + charCount);
    }
}
