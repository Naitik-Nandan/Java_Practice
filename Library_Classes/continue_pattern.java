//import java.util.*;
public class continue_pattern {
    public static void main(String[] args) {
        int k= 0;
        for (int i =0; i<5 ;i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print((char)(65+k));
                k++;
            }
            System.out.println();
        }
    }
}