import java.util.*;

public class SwapArr {

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      ArrayList <Integer> arr = new ArrayList <>();
      for(int a = 0 ; a<5 ; a++){
          arr.add(sc.nextInt());
      }

      System.out.println(arr);
      int firstIndex = 0 ;
      int lastIndex = arr.size() - 1 ;

      while(firstIndex < lastIndex) {
          swap(arr , firstIndex , lastIndex);
          firstIndex++;
          lastIndex--;



      }
      System.out.println(arr);

    }

    public static void swap(ArrayList<Integer> arr , int firstIndex , int lastIndex){
         int temp = arr.get(firstIndex);
         arr.set(firstIndex , arr.get(lastIndex));
         arr.set(lastIndex,temp);

    }
}
