package tcs_ipa_35mrks;

import java.util.*;

class Antenna {
    private int antennaId ;
    private String antennaName ,projectLead ;
    private double antennaVSWR ;

    Antenna(int antennaId , String antennaName , String projectLead , double antennaVSWR){
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }
    public void setAntennaId( int antennaId){
        this.antennaId = antennaId;
    }
    public int getAntennaId(){
        return antennaId ;
    }
    public void setAntennaName(String antennaName){
        this.antennaName = antennaName;
    }
    public String setAntennaName(){
        return antennaName;
    }
    public void setProjectLead(String projectLead){
        this.projectLead = projectLead;
    }
    public String getProjectLead(){
        return projectLead = projectLead;
    }
    public void setAntennaVSWR(double antennaVSWR){
        this.antennaVSWR = antennaVSWR;
    }
    public double getAntennaVSWR(){
        return antennaVSWR;
    }

}

public class AntennaSolutionIPA18 {
    public static int searchAntennaByName( ArrayList<Antenna> antennaArrayList, String antennaName){

        for(int a = 0 ; a < antennaArrayList.size(); a++){
            if(antennaArrayList.get(a).setAntennaName().equalsIgnoreCase(antennaName)){
                return antennaArrayList.get(a).getAntennaId();
            }
        }
       return 0 ;
    }
 public static ArrayList<Antenna> sortSAntennaByVSWR(ArrayList <Antenna> antennaArrayList , double VSWR){
        ArrayList <Antenna> antennaSortArr = new ArrayList<>() ;
        for( int a = 0 ; a < antennaArrayList.size(); a++){
            if(antennaArrayList.get(a).getAntennaVSWR() < VSWR){
                antennaSortArr.add( antennaArrayList.get(a));
            }
        }
     for(int p = 0 ; p < antennaSortArr.size()-1 ; p++){
         for(int b = p+1 ; b < antennaSortArr.size(); b++){
             if( antennaSortArr.get(p).getAntennaVSWR() > antennaSortArr.get(b).getAntennaVSWR()){
                 Antenna temp = antennaSortArr.get(p);
                 antennaSortArr.set(p , antennaSortArr.get(b));
                 antennaSortArr.set(b,temp);
             }

         }
     }

        return antennaSortArr;
 }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Antenna> antennaArray = new ArrayList<>();

        for(int a = 0 ; a < 4 ; a++){
            int antennaid = sc.nextInt();
            sc.nextLine();
            String antennaName = sc.nextLine();
            String projectLead = sc.nextLine();
            double antennaVSWR= sc.nextDouble();
            antennaArray.add(new Antenna(antennaid,antennaName, projectLead,antennaVSWR));


        }
        sc.nextLine();
        String antennaName = sc.nextLine();
        double VSWR = sc.nextDouble();
        int ans = searchAntennaByName(antennaArray ,antennaName);
        if(ans != 0){
            System.out.println(ans);
        }
        else{
            System.out.println("There is no antenna with given parameter");
        }

        ArrayList<Antenna> SortArr = sortSAntennaByVSWR(antennaArray , VSWR);
        if( SortArr.isEmpty()){

            System.out.println("not found");
        }
        else{
            for( Antenna an : SortArr){
                System.out.println(an.getProjectLead());

            }

        }


    }
}
