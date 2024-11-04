import java.sql.SQLOutput;
import java.util.*;

public class Beach_IPA51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Beach> beachObj = new ArrayList<>();
        for(int a = 0 ; a < 4 ; a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int rating = sc.nextInt();
            int cost = sc.nextInt();
            beachObj.add(new Beach(id , name, rating ,cost));
        }
        sc.nextLine();
        String nameParams = sc.nextLine();
        int  costParams = sc.nextInt();
        int ans = findLeastRating( beachObj , nameParams,costParams);
        System.out.println(ans);


    }

    public static int findLeastRating(ArrayList<Beach> beachObj ,String name ,int cost){
        int mRating = Integer.MAX_VALUE;
        for(Beach b : beachObj){
            if(b.getName().equalsIgnoreCase(name) && b.getCost() > cost){
                  if(b.getRating()<mRating){
                      mRating = b.getRating();
                  }
            }
        }
      return mRating;
    }
}

class Beach{
    private int id ;
    private String name;
    private int rating;
    private int cost ;

    Beach(int id , String name , int rating ,int  cost){
        this.id = id ;
        this.name = name ;
        this.rating = rating;
        this.cost = cost;
    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name ;
    }
    public int getRating(){
        return rating ;

    }
    public int getCost(){
        return cost ;
    }

}
