import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();

        // Tribonacci: Each term is the sum of the previous three terms
        // T(0) = 0, T(1) = 0, T(2) = 1
        // T(n) = T(n-1) + T(n-2) + T(n-3)

        int first = 0, second = 0, third = 1;

        System.out.println("Tribonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(first + " ");
            } else if (i == 2) {
                System.out.print(second + " ");
            } else if (i == 3) {
                System.out.print(third + " ");
            } else {
                int next = first + second + third;
                System.out.print(next + " ");
                first = second;
                second = third;
                third = next;
            }
        }

        System.out.println();
        in.close();
    }
}
