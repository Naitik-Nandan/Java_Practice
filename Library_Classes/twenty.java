import java.util.Scanner;

public class twenty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ar [] = new char [20];
        int v=0, c =0;
        for (int i=0; i<20 ; i++) {
            ar[i] = in.next().charAt(0);
            ar[i]=Character.toUpperCase(ar[i]);
            if(ar[i] == 'A' || ar[i] == 'E' || ar[i] == 'I'|| ar[i]== 'O' || ar[i] == 'U')
                v++;
            else if(ar[i] != 'A' || ar[i] != 'E' || ar[i] != 'I'|| ar[i]!= 'O' || ar[i] != 'U' && Character.isLetter(ar[i])==true)
                c++;
        }
        System.out.println("Vowels: "+v + "\t Consonants: "+c);
        in.close();
    }
}
