
import java.io.*;
import java.util.*;
import java.lang.*;
public class occu1 {
    public static void main(String[] args) {
        int num=133345;
        int c=0;
        char c1='3';
        String s=Integer.toString(num);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c1){
                c=c+1;

            }
            System.out.println(c);

        }
    }
}
