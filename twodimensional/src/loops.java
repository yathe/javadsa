public class loops {
    static void func1(int a[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n/2;j++){
                if(a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                }
                for(int j=n/2;j<n-1;j++){
                    if(a[j]<a[j+1]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;

                    }
                }
                for(i=0;i<n;i++){
                    System.out.println(a[i]+" ");
                }
            }


        }

    public static void main(String[] args) {
        int a[]={91,73,34,87,44,67};
        int n=a.length;
        func1(a,n);
    }

    }

