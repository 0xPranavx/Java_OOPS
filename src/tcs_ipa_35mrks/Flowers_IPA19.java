package tcs_ipa_35mrks;

import java.util.*;

public class Flowers_IPA19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Flower> flowObj = new ArrayList<>();

        for(int a = 0 ; a<4 ;a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            int rating = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();
            flowObj.add(new Flower(id , name , price , rating , type));

        }

        String params = sc.nextLine();

        Flower ans = findMinPrice(flowObj , params );
        if(ans == null){
            System.out.println("not found" );
        }
        else{
            System.out.println(ans.id);
        }



    }

    public static Flower findMinPrice(ArrayList<Flower> obj , String type){
        int minPrice = Integer.MAX_VALUE ;
        Flower ans = null ;
        for( Flower f : obj){
            if(f.type.equalsIgnoreCase(type) && f.price < minPrice ){
                minPrice = f.price ;
                ans = f ;
            }
        }

        return ans;
    }


}

class Flower{
    int id ;
    String name;
    int price;
    int rating ;
    String type;

    Flower(int id , String name , int price , int rating ,String type){
        this.id = id ;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }
}
