import java.util.*;
public class alpha {
    public static void main(String[] args) {
        Scanner oo = new Scanner(System.in);
        System.out.println("Enter Option");
        int o = oo.nextInt();
        switch (o) {
            case 1:
                for(int i = 90 ; i>=65 ; i--) {
                    System.out.println((char)i);
                }
                break;
            case 2:
                for (int i = 97 ;i<=122 ; i++) {
                    System.out.println((char)i);
                }
                break;
        }
        oo.close();
    }
}
