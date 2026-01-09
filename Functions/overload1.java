package Functions;
//import java.util.*;
public class overload1 {
    int transform (int n) {
        int d=0;
        while (n>0) {
            d+=n%10;
            n/=10;
        }
        return d;
    }
    void transform (String s) {
        System.out.println(s.toUpperCase());
    }
    void transform (char ch) {
        for (int i =0 ; i<3 ; i++) {
            for (int j=0 ; j<3 ; j++)
                System.out.print(ch);
            System.out.println();
        }
    }
    public static void main(String[] args) {
       // Scanner in = new Scanner (System.in);
       overload1 ob = new overload1();
       System.out.println(ob.transform(458));
       ob.transform("Blue");
       ob.transform('@');

    }
}
