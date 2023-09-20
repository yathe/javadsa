import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
        int arr2[][]=new int[4][];
        arr2[0]=new int[2];
        arr2[1]=new int[3];
        arr2[2]=new int[2];
        arr2[3]=new int[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr2.length;i++){
            System.out.println("enter the dat of row:"+i);
            System.out.println();
            for(int j=0;j<arr2[i].length;j++){
                System.out.print("enter the data");
                arr2[i][j]=s.nextInt();
            }

        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print( arr2[i][j]+"");
                          }
            System.out.println();

        }




    }
}
