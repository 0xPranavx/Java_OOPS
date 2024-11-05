package tcs_ipa_35mrks;

import java.util.*;
public class Resort_IPA55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Resort> resortObj = new ArrayList<>();

        for ( int a = 0 ; a < 4 ; a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            resortObj.add(new Resort(id , name ,category,price,rating));


        }
        sc.nextLine();
        String parameter = sc.nextLine();
        int  ans = findAvgPrice(resortObj, parameter);

        System.out.println(ans);



    }

    public static int findAvgPrice(ArrayList<Resort> resortObj , String category){

        int count = 0 ;
        int sum = 0 ;

        for(Resort r : resortObj){
            if( r.getCategory().equalsIgnoreCase(category) && r.getResortRating()> 4){
                count ++ ;
                sum += r.getResortPrice();
            }
        }
//        double ans =  ;
        return sum/count ;

    }

}

class Resort{
    private int  resortId;
    private String resortName;
    private String category;
    private double resortPrice ;
    private double resortRating;

    Resort(int resortId , String resortName , String category , double resortPrice, double resortRating ){
        this.resortId = resortId ;
        this.resortName =resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    public int getResortId(){
        return resortId;
    }
    public String getResortName(){
        return resortName;
    }
    public String getCategory(){
        return category;
    }
    public double getResortPrice(){
        return resortPrice;
    }
    public double getResortRating(){
        return resortRating;
    }

}
