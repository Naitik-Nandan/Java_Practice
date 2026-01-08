package Nested_Loops;

import java.util.Scanner;

//num=num+0;
public class fibonacciTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Limit");
        int n = in.nextInt();
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) { 
            
            for (int j =0 ; j<i ; j++){//c->b->a
            System.out.print(a + " "); // Print current term
            c = a + b; // Calculate next term // 
            a = b; // Shift: a becomes b
            b = c; // Shift: b becomes next term
            }
            c=0;a=0;b=1;
            System.out.println();
        }
        System.out.println(); // New line at the end
        in.close();
    }
}
