package tcs_ipa_15mrks;

import java.util.*;

public class FindLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        String largest= "" ;
        for(int a =0 ; a<arr.length ; a++){
            if (arr[a].length() > largest.length()) {
                largest = arr[a];

            }
        }
        System.out.println(largest);
    }
}
