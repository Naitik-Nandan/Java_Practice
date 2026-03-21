import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int i =0, j=0;
        int ar[][]  = new int [4][4];
        for (i=0; i<4; i++) {
            for ( j =0 ; j<4; j++){
                ar[i][j]= in.nextInt();
            }
        }
        //Display
        for (i=0; i<4; i++) {
            for ( j =0 ; j<4; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int ld=0,rd=0;
        for (i=0; i<4; i++) {
            ld+=ar[i][i];
            for (j =0 ; j<4; j++){
                if(i+j==3)
                    rd+=ar[i][j];
            }
        }
        System.out.println("Sum of Left Diagonal: "+ld +"\nSum of Right Diagonal: "+rd);
        if(ld==rd)
            System.out.println("Thus, it is a Diagonal Array");
        in.close();

    }
}