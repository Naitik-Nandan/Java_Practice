package Nested_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);
        System.out.println("Enter Limit");
        int n= in.nextInt();
        int d=0,sumn=1,sum=0;
        int og=0;
        og=n;
        while (n>0) {
            d = n%10;
            for (int j = 1 ; j<=d ; j++) {
                sumn = sumn*j;
            }
            sum +=sumn;
            sumn=1;
            n/=10;
        }
        System.out.println(sum);
        if (sum==og)
            System.out.println("Special Number");
        else
            System.out.println("You're Normal Bro!");
        in.close();

    }
}
