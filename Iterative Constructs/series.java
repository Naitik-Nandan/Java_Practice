import java.util.*;
public class series {
    public static void main (String args []) {
        Scanner in =  new Scanner (System.in);
        System.out.println("Enter a Number");
        int a = in.nextInt();
        int sum = 0;
        System.out.println("Enter the Limit");
        int n = in.nextInt();
        for (int i = 1 ; i<n ; i++) {
            sum += (a/i);
        }
        System.out.println(sum);
        in.close();
    }
}
