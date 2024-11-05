package tcs_ipa_15mrks;
import java.util.*;
public class PrefectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int sum = 0 ;

        for(int a = 1 ;a <in ;a++ ){
            int p = in %a ;
            if( in % a == 0 ){
                sum += a ;
            }
        }
        System.out.println(sum);
        if(sum == in){
            System.out.println("perfect number");
        }
        else {
            System.out.println("not a perfect number");
        }
    }


}
