import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ar[] = new int [10];
        System.out.println("Enter 10 Numbers");
        for (int i = 0; i<10 ; i++) {
            ar[i] = in.nextInt();
        }
        for(int i =0; i<10; i++)
            System.out.print(ar[i]);
        System.out.println();
        int mid = 0, s=0, e=0, k=-1;
        e=9;
        System.out.println("Enter the Number to searched");
        int sn=in.nextInt();
        while (s<=e) {
            mid=(s+e)/2;
            if(ar[mid] == sn){
                k=1;
                break;
            }
            if(ar[mid]>sn)
                e=mid-1;
            if(ar[mid]<sn)
                s=mid+1;
        }
        if(k==1)
            System.out.println("Number found in index:"+mid);
        else
            System.out.println("Number not found");
        in.close();
    }
}
