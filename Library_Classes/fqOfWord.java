package Library_Classes;

import java.util.Scanner;

public class fqOfWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Sentence");
        String st = in.nextLine();
        String st2="", sw;
        int f=0;
        st+=" ";
        System.out.println("Enter the Word to be Searced");
        sw=in.next();
        for (int i =0; i<(st.length()); i++) {
            char ch = st.charAt(i);
            if (ch == ' ') {
                if(st2.equals(sw)) {
                    f++;
                    st2="";
                }
            }
            else
                st2+=ch;
        }
        System.out.println("Frequency: "+f);
        in.close();
    }
}
