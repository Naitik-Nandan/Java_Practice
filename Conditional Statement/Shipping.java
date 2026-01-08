import java.util.*;
public class Shipping {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        char type;
        int wt, ch = 0;
        System.out.println("Ente the Weight of the Parcel");
        wt = in.nextInt();
        System.out.println("Enter 'O' for Ordinary Booking, and 'E' for Express Booking");
        type = in.next().charAt(0);
        switch (type) {
            case 'O' :
                if (wt <= 100)
                    ch = 80;
                if (wt > 100 && wt <= 500)
                    ch = 150;
                if ( wt > 500 && wt <= 1000)
                    ch = 210;
                if (wt > 1000)
                    ch = 250;
                break;

            case 'E' :
                if (wt <= 100)
                    ch = 100;
                if (wt > 100 && wt <= 500)
                    ch = 200;
                if ( wt > 500 && wt <= 1000)
                    ch = 250;
                if (wt > 1000)
                    ch = 300;
                break;
        }
        System.out.println("Cost: INR " +ch);
        in.close();
    }
}
