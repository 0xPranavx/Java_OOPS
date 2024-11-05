package tcs_ipa_35mrks;

import java.util.*;

public class Employee_IPA52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Employee> employeeObj = new ArrayList<>();
        for(int a = 0 ; a<5 ; a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String dept = sc.nextLine();
            int Rating = sc.nextInt();
            int salary = sc.nextInt();
            employeeObj.add(new Employee(id , name , dept, Rating , salary));
        }



        int salaryParams = sc.nextInt();
        sc.nextLine();
        String deptParams = sc.nextLine();

        ArrayList <String> deptAns = findDept(employeeObj , salaryParams);
        int sHighestAns = findSecondHighestSalary(employeeObj,deptParams );
        StringBuilder sb = new StringBuilder();
        for(String s : deptAns){
            sb.append(s).append(", ");
        }

        String result = sb.toString();
        System.out.println(result);
        System.out.println(sHighestAns);




    }

   public static ArrayList<String> findDept(ArrayList<Employee> employeeObj , int salary){
        ArrayList <String> dept = new ArrayList<>();
        for(Employee e : employeeObj){
            if(e.getSalary()==salary && e.getRating() >= 3){
                dept.add(e.getDept());
            }
        }
      return dept ;
   }

   public static int findSecondHighestSalary(ArrayList<Employee> employeeObj , String dept){
        ArrayList <Employee> deptObj = new ArrayList<>();

        for(Employee e : employeeObj){
            if(e.getDept().equalsIgnoreCase(dept)){
                deptObj.add(e);

            }
        }
       int highest = Integer.MIN_VALUE;
       int sHighest = 0 ;

        for(Employee e : deptObj){
            if(e.getSalary()>highest){

                sHighest = highest;
                highest = e.getSalary();
            }
            else if(e.getSalary()> sHighest && e.getSalary() < highest){
                sHighest = e.getSalary();
            }
        }

return sHighest;

   }
}

class Employee{
    private int id ;
    private String name ;
    private String dept ;
    private int rating ;
    private int salary ;

    Employee(int id , String name , String dept , int rating , int Salary){
        this.id = id ;
        this.name = name ;
        this.dept = dept;
        this.rating = rating;
        this.salary = Salary ;
    }

    public int getId(){
        return id ;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public int getRating(){
        return rating;
    }
    public int getSalary(){
        return salary;
    }
}
