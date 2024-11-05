package tcs_ipa_35mrks;

import java.util.*;

class Sim2 {
    private int id ;
    private String company ;
    private int balance;
    private double ratePerSecond ;
    private String circle ;

    Sim2(int id , String company , int balance , double ratePerSecond , String cirle){
        this.id = id ;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = cirle;
    }



    public void Setid(int Id){
        id = Id ;
    }
    public int Getid(){
        return id ;
    }
    public void SetCompany(String Company){
        company = Company;
    }
    public String GetCompany(){
        return company ;
    }
    public void SetBalance(int Balance){
        balance = Balance;
    }
    public int GetBalance(){
        return balance;
    }
    public void SetRatePerSecond(double RatePerSecond){
        ratePerSecond = RatePerSecond;
    }
    public double GetRatePerSecond(){
        return ratePerSecond;
    }
    public void SetCircle(String Circle){
        circle = Circle;
    }
    public String GetCircle(){
        return circle ;
    }


}



public class SimSolution {
    public static ArrayList<Sim2> matchAndSort(ArrayList<Sim2> sim_object , String search_circle , double search_rate){
        ArrayList<Sim2> ans = new ArrayList<>();

        for( int a = 0 ; a < sim_object.size() ; a++){
            if(sim_object.get(a).GetCircle().equalsIgnoreCase(search_circle) && sim_object.get(a).GetRatePerSecond() < search_rate){
                ans.add(sim_object.get(a));
            }

        }
        for(int a = 0 ; a < sim_object.size()-1;a++){
            for(int b = a+1 ; b < sim_object.size();b++){
                if(ans.get(a).GetBalance() < ans.get(b).GetBalance()){
                    Sim2 bal = ans.get(a);
                    ans.set(a, ans.get(b));
                    ans.set(b , bal);


                }
            }
        }

       return ans ;
    }

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       ArrayList<Sim2> SimArr = new ArrayList<>();
       for(int a = 0 ; a < 4 ; a++){
           int id = sc.nextInt();
           sc.nextLine();
           String company = sc.nextLine();
           int balance = sc.nextInt();
           double ratePerSecond = sc.nextDouble();
           sc.nextLine();
           String circle = sc.nextLine();
           SimArr.add(new Sim2(id , company,balance,ratePerSecond,circle));
//           System.out.println(id + company + balance + ratePerSecond + circle);
       }
//        SimArr.add(new tcs_ipa_35mrks.Sim2(1,"jio",430,1.32,"mumbai"));
//        SimArr.add(new tcs_ipa_35mrks.Sim2(2,"vodafone",630,2.32,"mumbai"));
//        SimArr.add(new tcs_ipa_35mrks.Sim2(3,"jio",530,3.32,"mumbai"));
       ArrayList <Sim2> ans = matchAndSort(SimArr , "mumbai", 4.3);

            for (Sim2 an : ans) {
                System.out.println(an.Getid());

            }


       }

    }

