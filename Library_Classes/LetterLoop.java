package Library_Classes;

import java.util.Scanner;

public class LetterLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's The Limit?");
        char ch = in.next().charAt(0);
        int chr = (int)ch;
        int i = 0,j=0;
        for (i=65; i<=chr; i++) {
            for (j=65 ; j<=i ; j++)
                System.out.print((char)j+" ");
            System.out.println();
        }
        //String st = "The Red Bottle is in Green Bag.";
        //System.out.println(st.replace("Red" , "Green"));
        //The Green Bottle is in Green Bag.
        in.close();

    }
}
