package tcs_ipa_15mrks;
import java.util.*;
public class RemoveConsecutiveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
//        String out ="";
//        char ch = '\0';
//
//        for(int a = 1 ; a<in.length(); a++ ){
//            if(in.charAt(a) != ch){
//                ch = in.charAt(a);
//                out += in.charAt(a);
//            }
//        }
//        System.out.println(out);

        String ans = twoPointerWay(in);
        System.out.println(ans);
    }

    public static String twoPointerWay(String in){
        String out = "";
        out += in.charAt(0);
        for(int a = 0 ; a < in.length()-1 ; a++){
            if(in.charAt(a) != in.charAt(a+1)){
                out += in.charAt(a+1);
            }
        }
        return out ;
    }

}
