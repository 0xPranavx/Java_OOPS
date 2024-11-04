package tcs_ipa_15mrks;

import java.util.*;
public class PrintLastChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        String output = "";
        for(int a = 0 ; a<arr.length ; a++){
            char ch = arr[a].charAt(arr[a].length()-1);
            if( !(ch >= '0' && ch<='9') ){
                output += ch ;

            }
        }
        System.out.println(output);

    }
}
