
import java.util.*;


 class framework {
    public static void main(String[] args) {
        ArrayList <String> arr=new ArrayList<>();
        arr.add("yathesth");
        arr.add("shyam");
        arr.add("vivek");
        arr.add("ravi");
        System.out.println(arr);
//        Iterator <String>itr= arr.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
        for(String Student:arr){
            System.out.println(Student);
        }

        }



    }
