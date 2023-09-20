import java.util.Stack;
import java.util.Iterator;

class st {
     public static void main(String[] args) {
         Stack <Integer> s1=new Stack<>();
         boolean result=s1.empty();
         System.out.println(result);

         s1.push(12);
         s1.push(23);
         s1.push(34);
         s1.push(65);
         System.out.println(s1);
         Iterator it=s1.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }
//         s1.pop();
//         System.out.println(s1);
//         s1.pop();
//         System.out.println(s1);
//         s1.pop();
//         System.out.println(s1);
//         s1.pop();
//         System.out.println(s1);
         int search = s1.search(65);
         System.out.println(search);
         int search1h = s1.search(23);
         System.out.println(search1h);
         int x=s1.peek();
         System.out.println(x);
         int x1=s1.peek();
         System.out.println(x1);


     }
}
