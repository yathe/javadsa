public class arrayquestion {
    static void reverse(int arr[],int n){
        int k,i,t;
        for(i=0;i<n/2;i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
            System.out.println("reverse the array");
        }
        for(k=0;k<n;k++){
            System.out.println(arr[k]);}
    }

    public static void main(String[] args) {
        int arr[]={11,22,33,44};
        reverse(arr,arr.length);
    }
}
