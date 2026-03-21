import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Letter");
        char ch = in.next().charAt(0);
        int chr = (int) ch;
        int rev = 0;
       int i  =1;
        while(chr>0) {
            int d = chr%10; //9 8
            chr/=10; //8 0
            rev = rev * i +d;
            i=i*10; //10 //100
        }
        System.out.println((char)rev);
        in.close();
    }
}
