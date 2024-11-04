import java.util.*;

public class TcsAssesment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Laptop> laptopObj = new ArrayList<>();
        for(int a = 0 ; a<4 ; a++){
            int laptopId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine().trim();
            String osType = sc.nextLine().trim();
            double price =sc.nextDouble();
            int rating = sc.nextInt();
            laptopObj.add(new Laptop(laptopId,brand,osType,price,rating));
        }

        // Input brand and OS type from the user
        sc.nextLine();
        String brandParams = sc.nextLine();
        String osParams = sc.nextLine();


        int brandAns = countOfLaptopByBrand(laptopObj, brandParams);
        System.out.println(brandAns);

        ArrayList<Laptop> osAns = searchLaptopByOsType(laptopObj, osParams);

        // Print laptops based on OS search
        for (Laptop l : osAns) {
            System.out.println(l.getLaptopId());
            System.out.println(l.getRating());
        }
    }

    // Method to count laptops by brand and rating greater than 3
    public static int countOfLaptopByBrand(ArrayList<Laptop> laptopObj, String brand) {
        int count = 0;
        for (Laptop l : laptopObj) {
//            boolean ans2 = laptopObj.get(0).getBrand().equalsIgnoreCase(brand) && laptopObj.get(0).getRating() > 3;
            if (l.getBrand().equalsIgnoreCase(brand) && l.getRating() > 3) {
                count += 1;
            }
        }
        return count;
    }

    // Method to search laptops by OS type and sort them by Laptop ID in descending order
    public static ArrayList<Laptop> searchLaptopByOsType(ArrayList<Laptop> laptopObj, String os) {
        ArrayList<Laptop> osLaptopObj = new ArrayList<>();

        for (Laptop l:laptopObj) {
           boolean ans =  l.getOsType().equalsIgnoreCase(os);
//           System.out.println(ans);
            if (l.getOsType().equalsIgnoreCase(os)) {
                osLaptopObj.add(l);
            }
        }

        // Sort laptops by Laptop ID in descending order
        for (int z = 0; z < osLaptopObj.size() - 1; z++) {
            for (int y = z + 1; y < osLaptopObj.size(); y++) {
                if (osLaptopObj.get(z).getLaptopId() < osLaptopObj.get(y).getLaptopId()) {
                    Laptop temp = osLaptopObj.get(z);
                    osLaptopObj.set(z, osLaptopObj.get(y));
                    osLaptopObj.set(y, temp);
                }
            }
        }
        return osLaptopObj;
    }
}

// Laptop class with necessary attributes and methods
class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    // Constructor to initialize Laptop object
    Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    // Getter methods for Laptop attributes
    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public String getOsType() {
        return osType;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}
