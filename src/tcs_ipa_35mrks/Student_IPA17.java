package tcs_ipa_35mrks;
import java.util.*;
public class Student_IPA17 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studObj = new ArrayList<>();
        for(int a = 0 ; a <4 ; a++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();
            studObj.add(new Student(id , name , subject , grade , date));
        }
        char gradeParams = sc.nextLine().charAt(0);
        int month = sc.nextInt();
        ArrayList <Student> ans = findStudent(studObj, gradeParams,month);
        if(ans.size() != 0) {
            for (Student s : ans) {
                System.out.println(s.name);
                System.out.println(s.subject);
            }
            System.out.println(ans.size());
        }
        else{
            System.out.println("not found");
        }

    }
    public static ArrayList<Student> findStudent(ArrayList<Student> studObj , char grade , int month){
        String find = Integer.toString(month);
        ArrayList<Student> sortObj = new ArrayList<>();
        for(Student s : studObj){
            String[] arr = s.date.split("/");


            if(s.grade == grade && arr[1].equals(month)){
                sortObj.add(s);
            }
        }
        for(int a = 0 ; a < sortObj.size()-1 ; a++){
            for(int b = a+1 ; b <sortObj.size(); b++){
                if(sortObj.get(a).rollno > sortObj.get(b).rollno){
                    Student temp = sortObj.get(a);
                    sortObj.set(a , sortObj.get(b));
                    sortObj.set(b , temp);
                }
            }
        }
        return sortObj ;
    }
}
class Student{
    int rollno ;
    String name ;
    String subject;
    char grade;
    String date;

    Student(int rollno , String name , String subject , char grade ,String date){
        this.rollno = rollno;
        this.name = name ;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }
}
