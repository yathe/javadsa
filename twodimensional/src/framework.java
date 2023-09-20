
import java.util.ArrayList;
import java.util.Iterator;

public class framework {
    public static void main(String[] args) {
        ArrayList <String> arr=new ArrayList<>();
            arr.add("yathesth");
              arr.add("shyam");
                arr.add("vivek");
                  arr.add("ravi");
                  System.out.println(arr);
        Iterator <String>itr= arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }



    }
}
