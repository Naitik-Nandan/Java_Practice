import java.util.Scanner;

public class selectionBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Total Number present in the Array.");
        int n = sc.nextInt();
        int ar[] = new int[n];
        int i = 0, j = 0, temp = 0;
        System.out.println("Enter Numbers");
        for (i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println("Array:");
        for (i = 0; i < n; i++)
            System.out.print(ar[i]);
        System.out.println();
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (ar[i] < ar[j]) { // Descending Order through Selection Sort
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (i = 0; i < n; i++)
            System.out.print(ar[i]);
        System.out.println();

        // Binary Search
        int s = 0, e = 0, mid = 0, k = 0;
        e = n - 1;
        System.out.println("Enter the Number to be Search according to the new Descending Array");
        int sn = sc.nextInt();
        while (s <= e) {
            mid = (s + e) / 2;
            if (ar[mid] == sn) {
                k++;
                break;
            } else if (ar[mid] < sn) {
                e = mid - 1;
            } else if (ar[mid] > sn) {
                s = mid + 1;
            }
        }
        if (k == 1)
            System.out.println("Element Found at Index:" + mid);
        else
            System.out.println("Element not found.");
        sc.close();
    }
}
