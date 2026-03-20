//import java.util.*;
public class pattern_4 {
    public static void main(String[] args) {
       int k =5;
        for (int i =65; i<=69 ;i++) {
            for (int j = 1; j<=5; j++) {
                if(j>k){
                    System.out.print((char)(j-k+64));
                }
                else
                System.out.print((char)(j+64));
            }
           k--;
            System.out.println();
        }
    }
}