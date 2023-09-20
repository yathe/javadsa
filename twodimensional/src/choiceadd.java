import java.util.Arrays;
import java.util.Scanner;
public class choiceadd{
    public static void main(String[] args) {
        int n, m, p;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the input");
        n = s.nextInt();

        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("enter the number");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("enter the position");
        m = s.nextInt();
        System.out.println("enter the value");
        p = s.nextInt();
        System.out.println("show the array output");
        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];}
             else if (i == m) {
                    b[i] = p;
                } else {
                    b[i] = a[i - 1];
                }}
                for (int i = 0; i < n; i++) {
                    System.out.print(b[i]);
                }

            }
        }










