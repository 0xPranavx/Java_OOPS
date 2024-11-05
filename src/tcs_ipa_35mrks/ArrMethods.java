package tcs_ipa_35mrks;

import java.util.*;

class Course{
    private int id ;
    private String subject ;
    private String[] courseArr = new String[2] ;

    Course(int id , String subject , String[] courseArr){
       this.id = id ;
       this.subject = subject ;
       this.courseArr = courseArr ;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id ;
    }
    public void setSubject( String subject){
        this.subject = subject ;
    }
    public String getSubject(){
        return subject ;
    }
    public void setCourseArr(String[] courseArr){
        this.courseArr = courseArr;
    }
    public String[] getCourseArr(){
        return courseArr;
    }



}

public class ArrMethods {
    public static void displayData(Course[] courseObj){
        for(Course an : courseObj){
            System.out.println(an.getId());
            System.out.println(an.getSubject());
            for(String cr : an.getCourseArr()){
                System.out.println(cr);
            }
        }
    }

    public static void main(String[] args){
            Course[] courseObj = new Course[2];
            Scanner sc = new Scanner(System.in);
            for ( int a = 0 ; a < courseObj.length ; a++){
                int id = sc.nextInt();
                sc.nextLine();
                String subject = sc.nextLine();
                String[] courseArr = new String[2];
                for(int b = 0 ; b < courseArr.length ; b++){
                    String course = sc.nextLine();
                    courseArr[b] = course;
                }
                courseObj[a] =new Course(id , subject , courseArr);

            }
            displayData(courseObj);



        }
    }

