package tcs_ipa_15mrks;

import java.util.Scanner;

public class PrintVowelFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       String[] arr = input.split(" ");
       String ans="";
       for(int a = 0 ; a< arr.length ; a++){
           char ch = arr[a].charAt(0);
           if( ch == 'a' || ch =='A' || ch == 'e'|| ch == 'E' || ch== 'i' || ch =='I'||
           ch== 'o' || ch =='O' || ch== 'u' || ch =='U'
           ){
               ans += ch;

           }

       }
        System.out.println(ans);
    }
}
