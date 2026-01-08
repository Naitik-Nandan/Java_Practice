package NumberBased;

import java.util.Scanner;

public class NEon {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter A NUmber");
    int n = in.nextInt();
    int nsq=0,d=0,f=0;
    nsq = n*n;
    while(nsq>0) {
        d+=nsq%10;
        if (d==n) {
            f++;
        }
        nsq=nsq/10;
    }
    if (f==1)
        System.out.println("Neon Number");
    else
        System.out.println("Not A Neon Number");
    in.close();
}
}
