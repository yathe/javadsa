
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *


//        public class starpattern {
//    public static void main(String[] args) {
//        int n=4;
//        int m=5;
//        for (int i = 1; i <= n; i++) {
//            for(int j=1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}
// HOLLOW RECTANGLE
//    * * * * *
//    *       *
//    *       *
//    * * * * *
//public class starpattern {
//    public static void main(String[] args) {
//        int n=4;
//        int m=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//}

import java.util.Arrays;

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class starpattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
