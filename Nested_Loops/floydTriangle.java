package Nested_Loops;

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Limit");
        int n = in.nextInt();
        int k = 1;
        for (int i =1; i<=n ; i++)
        {
            for (int j =1 ; j<=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
        in.close();
    }
}
