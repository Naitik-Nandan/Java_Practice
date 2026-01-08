package Nested_Loops;

import java.util.Scanner;

public class reverse2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Limit");
        int n = in.nextInt();
        int i =0, j=0,p=1;
        for (i = n ; i>=1 ; i--) {
            for (int k =1 ; k<p ; k++)
                System.out.print("  ");
            for (j=i; j>=1 ; j--)
                System.out.print(j+" ");
            System.out.println();
            p++;
        }
}
}