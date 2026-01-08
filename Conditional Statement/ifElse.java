import java.util.Scanner;
public class ifElse
{
    public static void main (String args []) {
        Scanner in = new Scanner (System.in);
        int cn, cu;
        double ch=0;
        String cname;
        System.out.println("Enter Your Name.");
        cname= in.nextLine();
        System.out.println("Enter Your Consumer Number.");
        cn= in.nextInt();
        System.out.println("Enter the Units you've consumed.");
        cu=in.nextInt();
        if (cu<=100)
            ch=5.5*cu;
        if (cu>100 && cu<=300)
            ch= 5.5*100 + 6.5 * (cu-100);
        if (cu>300 && cu<=600)
            ch= 5.5*100 + 6.5 * 200 + 7.5 * (cu-300);
        if (cu>600 && cu <= 1200)
            ch = 5.5*100 + 6.5 * 200 + 7.5 * 300 + 8.5 * (cu-600);
        System.out.println("Consumer's Name: "+cname +
            "\n Customer's Number: "+cn +
            "\n Units Consumed: " + cu + 
            "\n Amount to be Paid: " +ch
        );
        in.close();
    }
}