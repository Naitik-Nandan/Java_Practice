import java.util.*;
public class incomeTax {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int age, ti;
        double  tax=0.0;
        char sex;
        System.out.println("Enter Your Age");
        age = in.nextInt();
        System.out.println("Enter 'M' if Male / 'F' if Female");
        sex = in.next().charAt(0);
        System.out.println("Enter your Taxable Income");
        ti = in.nextInt();
        if (age<=65 && sex == 'M')
        {
            if (ti <= 250000)
                tax=0;
            if (ti >250000 && ti <= 500000)
                tax = (ti-250000)*0.1;
            if (ti > 500000 && ti <=1000000)
                tax = (ti-500000) * 0.2 + 340000;
            if (ti > 1000000)
                tax = (ti-1000000) * 0.3 + 94000;
            System.out.println("Income Tax Payable:" +tax);
        }
        else
            System.out.println("Wrong Category");
        in.close();
    }
}
