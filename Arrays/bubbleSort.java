package Arrays;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Limit");
        int n = in.nextInt();
        int ar[] = new int [n];
        for (int i  =0 ; i<n ; i++)
            ar[i] =  in.nextInt();
        for (int i = 0; i<n ; i++)
            System.out.print(ar[i]);
        System.out.println();
        for (int i = 0 ; i< n-1 ; i++) {
            for (int j =0 ; j<n-1-i ; j++) {
                if(ar[j]>ar[j+1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        for (int i = 0; i<n ; i++)
            System.out.print(ar[i]+" ");
        System.out.println();
        in.close();
    }
}