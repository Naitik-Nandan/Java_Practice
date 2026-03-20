//import java.util.*;
public class pattern_3 {
    public static void main(String[] args) {
        int k =0;
        for (int i =65; i<=69 ;i++) {
            for (int j = 65; j<=69-k; j++) {
                System.out.print((char)(j)+"*");
            }
            k++;
            System.out.println();
        }
    }
}