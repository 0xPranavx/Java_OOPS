package tcs_ipa_15mrks;
 import java.util.*;
public class RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String out = "";
        for(int a = 0 ; a<in.length(); a++){
            char ch = in.charAt(a);
            if( !(ch == 'a' || ch =='A' || ch == 'e'|| ch == 'E' || ch== 'i' || ch =='I'||
                    ch== 'o' || ch =='O' || ch== 'u' || ch =='U')
            ){
                out += in.charAt(a);
            }
        }
        System.out.println(out);
    }
}
