package tcs_ipa_35mrks;

import java.sql.SQLOutput;
import java.util.*;

public class Footwear_IPA2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Footwear> footObj = new ArrayList<>();

        for(int a = 0 ;a<5 ;a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();


            footObj.add(new Footwear(id,name , type , price));
        }

        sc.nextLine();
        String typeParams = sc.nextLine();
        String nameParams =sc.nextLine();

        int typeAns = getCountByType(footObj , typeParams);
        Footwear min = findSecondHighest(footObj,nameParams);

        System.out.println(typeAns);
        System.out.println(min.id);
        System.out.println(min.name);
        System.out.println(min.price);


    }

    public static int getCountByType(ArrayList<Footwear> obj , String type){
        int count = 0 ;

        for(Footwear f: obj){
            if(f.type.equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }

    public static Footwear  findSecondHighest(ArrayList<Footwear> obj , String brand){
        int highest = obj.get(0).price ;
        int sHighest = 0;
        Footwear High = obj.get(0) ;
        Footwear sHigh = null;
        ArrayList<Footwear> minObj = new ArrayList<>();

        for(Footwear f : obj) {
            if (f.name.equals(brand)) {
                minObj.add(f);
            }
        }
            for(int a = 1 ; a<obj.size() ; a++ ){
                if(obj.get(a).price > highest){
                    sHigh = High;
                    High = obj.get(a);

                }
                else if( obj.get(a).price > sHighest && obj.get(a).price < highest){
                    sHigh = obj.get(a);
                }
            }
            return sHigh;



    }
}

class Footwear{
    int id ;
    String name ;
    String type;
    int price;

    Footwear(int id , String name ,String type , int price){
        this.id = id ;
        this.name = name;
        this.type = type;
        this.price = price;
    }

}