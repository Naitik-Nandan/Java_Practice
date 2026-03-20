import java.util.*;
public class alpha_2 {
    public static void main(String[] args) {
        Scanner oo = new Scanner(System.in);
        System.out.println("Enter Option");
        int o = oo.nextInt();
        switch (o) {
            case 1:
                System.out.println("Letters \t Unicode");
                for(int i = 90 ; i>=65 ; i--) {
                    System.out.println((char)i +"\t \t     " + i);
                }
                break;
            case 2:
                System.out.println("Letters \t Unicode");
                for (int i = 97 ;i<=122 ; i++) {
                    System.out.println((char)i +"\t \t     " + i);
                }
                break;
        }
        oo.close();
    }
}
