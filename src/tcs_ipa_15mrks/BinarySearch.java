package tcs_ipa_15mrks;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> strArr = new ArrayList<>();

        for(int a = 0 ; a<5 ;a++){
            strArr.add(sc.nextLine());
        }
        System.out.println(strArr);
        System.out.print("enter search string: ");
        String searchStr = sc.nextLine();

        int index = -1 ;

        for ( String str : strArr){
            if( str.equals(searchStr)){
                index = strArr.indexOf(str);
                break;
            }

        }

        System.out.println(index);
    }
}
