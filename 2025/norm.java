import java.util.*;
public class norm {
    public static void main(String[] args) {
        int i=0,j=0;
        int ar[][] = new int [4][4];
        Scanner in = new Scanner (System.in);
        for (i=0; i<4 ; i++)
        {
            for (j=0; j<4; j++)
            {
                ar[i][j] = in.nextInt();
            }
        }
        System.out.println();

        for (i=0; i<4 ; i++)
        {
            for (j=0; j<4; j++)
            {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }

        double sumsq = 0;
        for (i=0; i<4 ; i++)
        {
            for (j=0; j<4; j++)
            {
                sumsq+=Math.pow(ar[i][j],2);
            }
        }

        double norm = 0;
        norm = Math.sqrt(sumsq);
        
        System.out.println("norm =" +norm);
        in.close();
    }
}
