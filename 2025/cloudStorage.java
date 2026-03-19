import java.util.*;

public class cloudStorage {
    int acno, space;
    double bill;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account No. & Space Required");
        acno = in.nextInt();
        space = in.nextInt();
        in.close();
    }

    void calculate() {
        if (space <= 15)
            bill = space * 15;
        else if (space > 15 && space <= 30)
            bill = 225 + (space - 15) * 13;
        else if (space > 30)
            bill = 225 + 195 + (space - 30) * 11;
    }

    void display() {
        System.out.println("Bill = " + bill);
    }

    public static void main(String[] args) {
        cloudStorage ob = new cloudStorage();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}