import java.util.*;
//import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Collection.*;
import java.util.concurrent.*;

class maximuminlist {
    public static void main(String[] args) {
        TreeSet<String> car= new TreeSet<>();
       // Map <String,Integer> car=new HashMap<>();
        car.add("BMW");
        car.add("Audi");
        car.add("Maruti_800");
        car.add("TataIndica");
        car.add("Audi");
        car.add("Mahendra_Thar");

        for(String v:car){
            System.out.println(v);
        }


//        for(Entry<String,Integer> x: car.entrySet()){
//            System.out.print(x.getKey());
//            System.out.println(x.getValue());
//            }
//        String searchkey="Audi";
//        if(car.containsKey(searchkey)){
//        System.out.println("Audi is present"+" "+car.get(searchkey));}
//            Iterator<Entry <String,Integer>>itr= car.entrySet().iterator();
//        while(itr.hasNext()){
//            Map.Entry<String,Integer> set=(Map.Entry<String,Integer>) itr.next();
//            System.out.println(set.getKey()+" "+set.getValue());
//            System.out.println();}
        }

    }


