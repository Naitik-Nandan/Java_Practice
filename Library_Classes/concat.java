import java.util.Scanner;
public class concat {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sum=0, prd=1;
        for (int i =0; i<10; i++) {
            int num = in.nextInt();
            sum+=num;
            prd*=num;
        }
        System.out.println(sum);
        System.out.println(prd);
        String Sum = Integer.toString(sum);
        String Prd = Integer.toString(prd);
        System.out.println(Sum.concat(Prd));
        in.close();
    }
}
