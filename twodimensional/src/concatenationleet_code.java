//
public class concatenationleet_code {
     static public int[] concatenation(int[] nums){
         int n= nums.length;
         int[] ans=new int[2*n];
         for(int i=0;i<n;i++){
             ans[i]=nums[i];
             ans[i+n]=nums[i];

         }
         return ans;

    }

    public static void main(String[] args) {
//        concatenationleet_code c=new concatenationleet_code();
        int[] nums={1,2,3,4};
       int []result= concatenation(nums);
       for(int k:result){
           System.out.print(k);
       }
    }
}
//________________________________________________________________________________________________________________________
//import java.util.Scanner;
//class Mainn{
//int arr[]=new int[4];
//    public void sumarray(){
//
//        Scanner s=new Scanner(System.in);
//        int value=0;
//        System.out.println("enter the 5 number in array"+" ");
//        arr[4]=s.nextInt();
//        for(int i=0;i< arr.length;i++){
//        value+=arr[i];
//            System.out.println(value);}
//
//    }
//
//    public static void main(String[] args) {
//        Mainn m=new Mainn();
//        m.sumarray();
//    }
//}
