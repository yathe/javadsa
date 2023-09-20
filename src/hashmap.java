import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

 class Noid {
    public static void main(String[] args) {
        Map <String,Integer> student=new HashMap<String,Integer>();
        student.put("yash",100);
        student.put("yashraj",56);
        student.put("Aditya",67);
        student.put("dheeraj",51);
        for(Map.Entry<String,Integer> x: student.entrySet()){
            System.out.print(x.getKey());
            System.out.println(x.getValue());
        }

    }
}
