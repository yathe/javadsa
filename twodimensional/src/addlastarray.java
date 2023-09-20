import java.util.Arrays;
import java.util.Scanner;
public class addlastarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,56};
        int n=arr.length;
        int new1[]=new int[n+1];
        Scanner s=new Scanner(System.in);
        int value=s.nextInt();

        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            new1[i]=arr[i];
        }
        new1[n]=value;
        System.out.println(Arrays.toString(new1));

    }
}
