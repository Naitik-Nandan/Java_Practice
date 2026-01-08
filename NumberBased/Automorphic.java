package NumberBased;

import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = in.nextInt();//25
        int nsq = 0,f=0; // 625
        nsq=n*n;
        int d=0, i=1;
        while (nsq>0) {
            d += (nsq % 10)*i; //625%10 = 5
            if (d==n) {
                f=1;
                break;
            }
            nsq=nsq/10;
            i=i*10;
        }
        if(f==1)
            System.out.println("The Number is Automorphic");
        else
            System.out.println("The Number is not Automorphic");
        in.close();
    }
}
