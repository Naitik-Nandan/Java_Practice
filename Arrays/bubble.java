package Arrays;

import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get array size
        System.out.println("Enter the number of elements:");
        int n = in.nextInt();
        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Display original array
        System.out.print("Original Array: ");
        printArray(arr);

        for (int i =0 ; i<n ; i++) {
            for (int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted Array:   ");
        printArray(arr);

        in.close();
    }

    // Helper method to print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
