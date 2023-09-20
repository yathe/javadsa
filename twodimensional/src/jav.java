import java.util.Arrays;
import java.util.Scanner;

public class jav {
    public static void main(String[] args) {
        int arr[]=new int[15];
        System.out.println("enter the element");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<=n;i++) {
            System.out.print("Enter the data");
        arr[i]=s.nextInt();
    }
    for( int i=0;i<n;i++){
        System.out.print(arr[i]+" ");

    }
    int k=n;
    for(int j=n-1;j>=0;j--){
        arr[k]=arr[j];
        k--;
    }
    System.out.println("");
    System.out.println("enter a new number to add in an array");
    arr[k]= s.nextInt();
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"");
    }
    }
}
