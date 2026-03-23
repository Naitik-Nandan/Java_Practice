import java.util.*;
public class twenty23 {
    void print(){
        for (int i=1; i<=5; i++){
            for(int j = 1; j<=5; j++)
                System.out.print(i);
            System.out.println();
        }
    }
    void print (int n){
        //Lead Number
        int se=0,so=0;
        while(n>0){
            int d=n%10;
            if(d%2==0)
                se+=d;
            else
                so+=d;
            n/=10;
        }
        if(se==so)
            System.out.println("Lead Number");
        else
            System.out.println("Not a Lead Number");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = in.nextInt();
        twenty23 ob = new twenty23();
        ob.print();
        ob.print(num);
        in.close();
    }
}
