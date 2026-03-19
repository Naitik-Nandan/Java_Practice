public class overload {
    void print () {
        for (int i = 0 ; i<5; i++)
        {
            for (int j = 0; j<4 ; j++) {
                if (j%2==0)
                    System.out.print("@");
                else 
                    System.out.print("#");
            }
            System.out.println();
        }
    }
    double print (double a, double b) {
        double sum = 0, x=0;
        sum=a;
        x=a;
        while (x<=b){
            x+=0.5;
            sum+=x;
        }
        return sum;
    }

    int print(char ch1, char ch2) {
        if(ch1>ch2)
            return ch1;
        else
            return ch2;
    }
    public static void main(String[] args) {
        overload ob = new overload();
        ob.print();
        double a = ob.print(1.0,4.0);
        System.out.println(a);
        int b = ob.print('A','Z');
        System.out.println((char)b);
    }
}
