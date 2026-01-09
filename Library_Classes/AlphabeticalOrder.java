package Library_Classes;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Sentence");
        String st = in.nextLine();
        int l = 0;
        l = st.length();
        for (int i = 65; i<90 ; i++) {
            for (int j = 0; j<l; j++) {
                char ch = st.charAt(j);
                if(ch==(char)i || ch == (char)(i+32))
                    System.out.print(ch);
            }
        }
        in.close();
    }
}
