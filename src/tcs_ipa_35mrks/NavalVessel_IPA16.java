package tcs_ipa_35mrks;

import java.util.*;

public class NavalVessel_IPA16{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Vnaval> vObj = new ArrayList<>();

        for(int a = 0 ; a <4 ;a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int plan = sc.nextInt();
            int completed = sc.nextInt();
            sc.nextLine();
            String purpose = sc.nextLine();
            vObj.add(new Vnaval(id , name , plan , completed,purpose));

        }

        int percentParams = sc.nextInt();
        sc.nextLine();
        String purposeParams = sc.nextLine();
        int ans = findAvg(vObj , percentParams);
        Vnaval pAns = findByGrade(vObj , purposeParams);
        System.out.println(ans);

        if(pAns == null){
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
        else if(pAns.classification ==100){
            System.out.println(pAns.name + "%Star");
        }
        else if(pAns.classification <= 99 && pAns.classification >=80  ){
            System.out.println(pAns.name + "%leader");
        }
        else if(pAns.classification <= 79 && pAns.classification >=55  ){
            System.out.println(pAns.name + "%Inspirer");
        }




    }

    public static int findAvg(ArrayList<Vnaval> vObj , int percent){
        int count = 0 ;
        int sum = 0 ;

        for(Vnaval v : vObj){
            v.classification  = (v.completed*100) / v.plan;
            if( v.classification >= percent){
                count++ ;
                sum += v.completed;
            }
        }

        return sum/count ;
    }

    public static Vnaval findByGrade(ArrayList<Vnaval> Vobj ,String purpose){
        Vnaval ans = null ;
        for(Vnaval v : Vobj){
            if(v.purpose.equals(purpose)){
                ans = v;
            }
        }
        return ans ;
    }

}

class Vnaval {
    int id ;
    String name ;
    int plan ;
    int completed;
    String purpose ;
    int classification;

    Vnaval(int id , String name , int plan , int completed , String purpose){
        this.id = id ;
        this.name = name;
        this.plan = plan;
        this.completed = completed;
        this.purpose = purpose;
    }

}