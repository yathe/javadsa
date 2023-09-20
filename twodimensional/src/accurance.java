public class accurance {

        static int fac(int n){
            if(n==0){
                return 1;
            }
            if(n==1){
                return 1;
            }
            int result;
           return result=n*fac(n-1);

        }

    public static void main(String[] args) {
        System.out.print(fac(5));
    }

}
