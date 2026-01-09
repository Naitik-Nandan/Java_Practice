package Strings;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter A Words");
        String st = in.nextLine();
        int i=0;
        String st1="";
        for (i =0; i<st.length(); i++) {
            char ch = st.charAt(i);
            if (ch=='A' ||  ch=='a' ||  
                ch=='E' ||  ch=='e' ||  
                ch=='I' ||  ch=='i' ||
                ch=='O' ||  ch=='o' ||
                ch=='U' ||  ch=='u' )
                break;
            else
                st1+=ch;
        }
        String st2 = st.substring(i,(st.length()));
        String st3 = (st2.concat(st1))+"AY";
        System.out.println(st3);
        in.close();
    }
}
