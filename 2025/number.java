import java.util.*;
public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = in.nextInt();
        int min = 9, max = 0;
        while (num>0) {
            int  d = num%10;
            if(d<min)
                min =d;

            if(d>max)
                max =d;
            num/=10;
        }
        int sum = min+max;
        System.out.println(sum);
        if ((min+max)%2==0)
            System.out.println("The Sum is Even");
        else 
            System.out.println("The Sum is Odd");
        in.close();
    }
}
