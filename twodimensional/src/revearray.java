import java.util.Scanner;
public class revearray {
    public static void main(String[] args) {

        int a[]={11,56,87,90,53};
        for(int i=0;i<a.length;i++){
            System.out.print("before reversing array");
            System.out.println(" "+a[i]);

        }
        for(int j=a.length-1;j>=0;j--){
            System.out.print("after reversing array");
            System.out.println(" "+a[j]);
        }
    }
}
