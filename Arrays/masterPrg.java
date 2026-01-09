package Arrays;

import java.util.Scanner;

public class masterPrg {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Limit");
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i<n ; i++)
            for(int j =0; j<n; j++)
                arr[i][j] = in.nextInt();
        System.out.println("Array:");
        for (int i = 0; i<n ; i++){
            for(int j =0; j<n; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
}
int rd=0;
    for (int i = 0 ; i<n; i++)
        for (int j =0 ; j<n; j++)
            if(i+j==4)
                rd+=arr[i][j];
    System.out.println(rd);
    int ld =0;
    for (int i = 0; i<n ; i++)
        ld+=arr[i][i];
    System.out.println(ld);
    int bdr =0, bdc=0;
    int k =0;
    for(int i=0; k<2; i=n-1) {
        for (int j =0; j<n; j++){
            bdr+=arr[i][j];
            bdc+=arr[j][i];
        }
        k++;
    }
    int bd =0;
    bd = bdr+bdc-arr[0][0]-arr[0][n-1]-arr[n-1][0]-arr[n-1][n-1];
    System.out.println("Sum of Boundary Elements:"+(bd));
    int rdus = 0;
    for (int i = 0 ; i<n-1 ; i++) {
        for (int j = n-(i+2); j>=0; j--)
            rdus += arr[i][j];
    }
    System.out.println("Elements Above Righ Diagonal:"+rdus);
    //int arr2[][] = new int [n][n];
    for (int i =0 ; i<n ; i++) {
        for (int j=0; j<n ; j++)
            if(j%2==0)
                System.out.print("1");
            else
                System.out.print("2");
            System.out.println();
    }
}
}
