

import java.util.*;

public class duplicate{
    public static void main(String[] args) {
        ArrayList<Character> n=new ArrayList<>();
        n.add('j');
        n.add('a');
        n.add('i');
        n.add('s');
        n.add('h');
        n.add('r');
        n.add('i');
        n.add('r');
        n.add('a');
        n.add('m');
        Set<Character> s1=new HashSet<>();
        for(Character x:n){
            s1.add(x);
        }
        for(Character x:s1){
            System.out.println(x);
        }







    }
}

