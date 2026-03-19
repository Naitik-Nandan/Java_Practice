import java.util.*;
public class isString {
   public static void main(String[] args) {
    Scanner oo = new Scanner (System.in);
    System.out.println("Eneter A String");
    String st =oo.nextLine();
    int lc =0, uc =0;
    for (int i =0 ; i<st.length() ; i++) {
        char ch = st.charAt(i);
        int chr = (int) ch;
        if (chr>=65 && chr < 90)
            uc++;
        else if  (chr >=97 && chr <=122)
            lc++;
    }
    if (lc==uc)
        System.out.println("Super String");
   else 
    System.out.println ("Better Luck, Next Time");
oo.close();
   }
}