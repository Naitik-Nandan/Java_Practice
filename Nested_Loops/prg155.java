package Nested_Loops;

import java.util.Scanner;

public class prg155 {
    public static void main (String args []) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Limit");
        int n  = in.nextInt();
        int a,b,c,p=2;
        for (a=1 ; a<n ; a++) {
            for (b=1 ; b<=a ; b++)
                System.out.print(a+" ");
            for (c=p; c<=n; c++)
                System.out.print(c+" ");
            p++;
            System.out.println();
        }
        in.close();
    }
}
