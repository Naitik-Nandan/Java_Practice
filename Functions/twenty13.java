import java.util.*;
public class twenty13 {
    double series(double n){
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum+=(1/i);
        }
        return sum;
    }
    double series (double a, double n){
        double sum  =0;
        for (int i = 1; i<=n; i+=3)
            sum+=(i/Math.pow(a,i+1));
        return sum;
    }
    public static void main(String[] args) {
        Scanner n_in = new Scanner(System.in);
        System.out.println("Enter Limit");
        int n = n_in.nextInt();
        int n1 = n_in.nextInt();
        int a = n_in.nextInt();
        twenty13 ob = new twenty13();
        System.out.println(ob.series(n));
        System.out.println(ob.series(a,n1));
        n_in.close();
    }
}
