package tcs_ipa_35mrks;

import java.util.*;

public class IPA_Demo2024{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Projector> projObj = new ArrayList<>();

        for(int a = 0 ; a < 4 ; a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine().trim();
            int price = sc.nextInt();
            int rating = sc.nextInt();
            sc.nextLine();
            String available = sc.nextLine().trim();
            projObj.add(new Projector(id , name ,price ,rating , available));

        }
        int rateParams = sc.nextInt();
        int ans = findMax(projObj , rateParams);
        System.out.println(ans);
    }


    public static int findMax(ArrayList<Projector> projObj , int rating){
        int maxPrice = Integer.MIN_VALUE;
        Projector ans = null ;
        for(Projector p : projObj){
            if(p.available().equalsIgnoreCase("TataCliq") && p.rating() > rating && p.price()> maxPrice ){

                maxPrice = p.price();
                ans = p ;

            }
        }
        return ans.getId() ;
    }
}

class Projector{
    private int id ;
    private String name ;
    private int price ;
    private int rating;
    private String available;

    Projector( int id , String name , int price , int rating , String available){
        this.id = id ;
        this.name = name;
        this.price = price ;
        this.rating = rating ;
        this.available = available;
    }

    public int getId(){
        return id ;
    }
    public String getName(){
        return name ;

    }
    public int price(){
        return price;
    }
    public int rating(){
        return rating;
    }
    public String available(){
        return available;
    }

}

