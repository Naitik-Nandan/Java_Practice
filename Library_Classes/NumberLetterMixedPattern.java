package Library_Classes;
import java.util.*;
public class NumberLetterMixedPattern {
    public static void main(String[] args) {
        Scanner in  = new Scanner (System.in);
        System.out.println("Enter Numerical Limit");
        int n = in.nextInt();
        int i =0, j=0;
        for ( i = 1; i<=n; i++) {
            for ( j = 1; j<=i; j++)
                System.out.print(i);
            for (j=j-1;j<=n; j++)
                System.out.print((char)(64+i));
            System.out.println();
        }
        in.close();
    }
}
