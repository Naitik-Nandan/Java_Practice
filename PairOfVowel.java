import java.util.Scanner;

public class PairOfVowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = "BEAUTIFUL";
        for (int i = 0; i < st.length() - 1; i++) {
            char ch1 = st.charAt(i);
            char ch2 = st.charAt(i + 1);
            if(ch1=='A' || ch1 == 'E' || ch1 =='I' || ch1 == 'O' || ch1 =='U' && ch2=='A' || ch2 == 'E' || ch2 =='I' || ch2 == 'O' || ch2 =='U') {
            String w = "" + ch1 + ch2; //Concatenation
            System.out.print(w+", ");
            }
        }
        in.close();
    }
}
