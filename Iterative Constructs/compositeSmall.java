import java.util.*;
public class compositeSmall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("Enter Choice");
        ch = in.nextInt();
        switch (ch) {
            case 1:
                int n, k=0;
                System.out.println("Enter Number");
                n = in.nextInt();
                for (int i =1; i < n ; i++){
                if(n%i==0)
                    k++;
                }
                if(k>1)
                    System.out.println("Composite Number Confirmed");
                else 
                    System.out.println("Not Possible");
                break;

            case 2:
                int n2, sn = 0, d;
                System.out.println("Enter A Number");
                n2 = in.nextInt();
                sn = n2%10;
                while(n2>0) {
                    d = n2%10; //1509%10 = 9 // 150%10 = 0
                    n2 = n2 / 10;//1509/10 = 150 // 150/10 = 15
                    if(d<sn) // 9<9? // 15<9? //
                        sn = d;
                }
                System.out.println("Smallest No. -> "+sn);
                break;
            default:
                System.out.println("Invalid Preference");
                break;
        }
        in.close();
    }
}