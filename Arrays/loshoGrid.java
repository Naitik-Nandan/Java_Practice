package Arrays;
import java.util.Scanner;
public class loshoGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar [][] = new int [3][3];
        for (int i=0; i<3; i++)
            for (int j =0; j<3; j++)
                ar[i][j] = sc.nextInt();
        for (int i=0; i<3; i++){
            for (int j =0; j<3; j++)
                System.out.print(ar[i][j]);
            System.out.println();
        }
        int sumr = 0 , sumc=0,k=0;
        for (int i =0 ; i<3 ; i++) {
            for (int j =0 ; j<3; j++) {
                sumr+=ar[i][j];
                sumc+=ar[j][i];
            }
            if(sumr==15)
                k++;
            if(sumc ==15)
                k++;
            sumr=0;
            sumc=0;
        }
        if (k==6)
            System.out.println("The Array is Losho Grid");
        else
            System.out.println("The array is not a Losho Grid");
        sc.close();
            
    }
}
