import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class llist {
    public static void main(String[] args) {
        ArrayList<String> m1=new ArrayList<>();
        m1.add("ram");
        m1.add("hanuman");
        m1.add("shiva");
        System.out.println(m1);

    ArrayList<String> m3=new ArrayList<>();
    m3.add("ram");
    m3.add("raju");
    m3.add("vishnu");
        System.out.println(m3);
        ArrayList<String> m4=new ArrayList<>();
        System.out.println(m1);
        for(String x:m1){
            m4.add(m3.contains(x)?"yes":"no");
            System.out.println(m4);
        }





    }
    }

