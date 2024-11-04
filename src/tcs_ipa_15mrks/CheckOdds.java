package tcs_ipa_15mrks;

import java.util.Scanner;

public class CheckOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0 ;

        while(num != 0){
            int check = num % 10;
            if(check%2 != 0){
                count++;
            }
            num /= 10 ;


        }

        if(count >= 3){
            System.out.println(true);

        }
        else {
            System.out.println(false);
        }
    }
}
