import java.sql.SQLOutput;

public class colleage {
    void Study(String s1,long registration){
        System.out.println("The name of student is"+" "+s1);
        System.out.println("The registration number of student is"+" "+registration);
    }
}
class Students extends colleage{
    public static void main(String[] args) {
        colleage c=new colleage();
        c.Study("Yathesth",123456);
    }

}
