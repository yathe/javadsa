import java.util.*;

//public class Threeparameter {
//    String studentname;
//    int rollnumber;
//    String collegename;
//
//    public Threeparameter(String studentname, int rollnumber, String collegename) {
//        this.studentname = studentname;
//        this.rollnumber = rollnumber;
//        this.collegename = collegename;
//    }
//    public void print(){
//        System.out.println(studentname+" "+rollnumber+" "+collegename);
//    }
//
//    public static void main(String[] args) {
//        Threeparameter s1=new Threeparameter("yathesth",123,"Rcet");
//        s1.print();
//        Threeparameter s2=new Threeparameter("Vivek",183,"Rcet");
//        s2.print();
//        Threeparameter s3=new Threeparameter("Raja",125,"Rcet");
//        s3.print();
//    }
//}
class Threeparameter{
    public static void main(String[] args) {
        List <String> s=new ArrayList<>();
        s.add("yash");
        s.add("yasraj");
        System.out.println(s);
        for(String x:s){
            System.out.println(x);}

            List <String> s2=new ArrayList<>();
            s2.add("hanuman");
            s2.add("vikrant");
            System.out.println(s2);
            for(String x1:s2){
                System.out.println(x1);}
                List <String> s3=new ArrayList<>();
                s3.addAll(s);
                s3.addAll(s2);
                System.out.println(s3);

        }


    }

