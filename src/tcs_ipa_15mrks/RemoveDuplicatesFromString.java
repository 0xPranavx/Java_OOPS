package tcs_ipa_15mrks;

import java.util.*;

public class RemoveDuplicatesFromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = "";
        ArrayList <Character> arr = new ArrayList<>();


        for( int a = 0 ; a<input.length() ; a++){
            arr.add(input.charAt(a));

        }
        Set <Character> ar = new LinkedHashSet<>(arr);

        for(Character ch : ar){
            output += ch ;
        }

        System.out.println(output);



    }
}
