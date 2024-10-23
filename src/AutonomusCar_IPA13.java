import java.util.ArrayList;
import java.util.Scanner;

public class AutonomusCar_IPA13 {
    public static void main(String[] args){
        ArrayList <AutonomusCar> autoCarObj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int a = 0 ; a < 4 ;a++){
            int carId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            int noOfconduct = sc.nextInt();
            int noOfPassed = sc.nextInt();
            sc.nextLine();
            String env = sc.nextLine();
            autoCarObj.add(new AutonomusCar(brand,env,carId,noOfconduct,noOfPassed));
        }

        String envParams = sc.nextLine();
        String brandParams = sc.nextLine();

        int sumOfEnvTest = findTestPassedByEnv(autoCarObj,envParams);
        ArrayList <AutonomusCar>  carGrade = updateCarGrade(autoCarObj,brandParams);
        System.out.println(sumOfEnvTest);
        if(carGrade.size() == 0){
            System.out.println("no car found with following brand");


        }
        else {
            for (AutonomusCar car : carGrade) {
                if ((car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted() >= 80) {
                    System.out.println(car.getBrand() + ": A1");
                } else {
                    System.out.println(car.getBrand() + ": B2");
                }
            }
        }
    }
    public static int findTestPassedByEnv (ArrayList <AutonomusCar> autoCarObj , String env){
        int sum = 0 ;
        for( AutonomusCar car :autoCarObj){
            if(car.getEnv().equals(env)){
                sum += car.getNoOfTestsPassed();
            }
        }
     return sum ;
    }

    public static ArrayList<AutonomusCar> updateCarGrade( ArrayList<AutonomusCar> autoCarObj , String brand){
        ArrayList <AutonomusCar> updateBrandCarObj = new ArrayList<>();

        for(AutonomusCar car : autoCarObj){
            if(car.getBrand().equals(brand)){
                updateBrandCarObj.add(car);
            }
        }
      return updateBrandCarObj;
    }
}

class AutonomusCar {
    private int carId , noOfTestsConducted , noOfTestsPassed;
    private String brand , enviroment ;

    AutonomusCar(String brand , String env , int carId , int noOfTestsConducted , int noOfTestsPassed){
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.enviroment = env;
    }

    public void setCardId (int carId){
        this.carId = carId;
    }
    public int getCarId(){
        return carId;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand ;
    }
    public void setNoOfTestsConducted(int noOfTestsConducted ){
        this.noOfTestsConducted = noOfTestsConducted;
    }
    public int getNoOfTestsConducted(){
        return noOfTestsConducted;
    }
    public void setNoOfTestsPassed(int noOfTestsPassed){
        this.noOfTestsPassed = noOfTestsPassed;
    }
    public int getNoOfTestsPassed(){
        return noOfTestsPassed;
    }
    public void setEnv(String env){
        this.enviroment =env;
    }
    public String getEnv(){
        return enviroment;
    }


}
