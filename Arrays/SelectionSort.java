

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get array size from user
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
        int min =0 ;
        for(int i = 0; i<n; i++){
        min=i;
        for (int j =i+1; j<n-1; j+=1){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        arr[i]=arr[min];
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
