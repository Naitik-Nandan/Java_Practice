package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Limit");
        int n = in.nextInt();
        int ar [] = new int [n];
        int f=0,l=0,mid=0;
        System.out.println("Enter Digits in the Array");
        for (int i =0; i<ar.length; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println("Enter the Number to be Searched");
        int sn = in.nextInt();
        int k =-1;
        l=ar.length-1;
        while(f<=l) {
            mid = (f+l)/2;
            if(ar[mid]==sn) {
                k=mid;
                break;
            } 
            if (ar[mid]<sn)
                f=mid+1;
            if(ar[mid]>sn)
                l=mid-1;
        }
        if(k!=-1)
            System.out.println("The Searched Number is Present at index "+k);
        else
            System.out.println("Number Not Found!");
        in.close();
    }
}
