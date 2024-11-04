package tcs_ipa_15mrks;

import java.util.*;

public class Anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        ArrayList<Character> sArr = new ArrayList<>();
        ArrayList<Character> tArr = new ArrayList<>();
        for(int a = 0 ; a < s.length(); a++){
            sArr.add(s.charAt(a));
            tArr.add(t.charAt(a));
        }
      for(int b = 0 ; b< sArr.size(); b++){

          for(int z = 0 ; z <tArr.size() ; z++){
              char l =tArr.get(z);
              if(sArr.get(b).equals(l)){
                  tArr.remove(z);
                  break;
              }

          }

      }

      if(tArr.size() == 0){
          System.out.println("anagram");
      }
      else{
          System.out.println("not anagram");
      }

    }
}