import java.util.*;

public class bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ar[] = new int[20];
        int t = 0;
        for (int i = 0; i < 20; i++)
            ar[i] = in.nextInt();
        // Unsorted Array
        for (int i = 0; i < 20; i++)
            System.out.print(ar[i]);
        System.out.println();

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9 - j; i++) {
                if (ar[i] > ar[i + 1]) {
                    t = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = t;
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            for (int i = 10; i < 19 - j; i++) {
                if (ar[i] < ar[i + 1]) {
                    t = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = t;
                }
            }
        }
        for (int i = 0; i < 20; i++)
            System.out.print(ar[i] + " ");
        in.close();
    }
}