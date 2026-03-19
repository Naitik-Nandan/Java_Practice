import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
    char ar[] = {'A', 'H', 'N', 'P', 'S', 'U', 'W', 'Y', 'Z', 'b', 'd' };
    int s=0, e=0,mid=0,pos=-1;
    e = ar.length-1;
    mid=(s+e)/2;
    System.out.println("Enter the Characte to be Searched");
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    while(s<=e) {
        mid=(s+e)/2;
        if (ar[mid]==ch){
            pos = mid;
            break;
        }
        else if ((int)(ar[mid])<(int)ch){
            s=mid+1;
        }
        else if ((int)(ar[mid])>(int)ch) {
            e=mid-1;
        }
    }
    if(pos!=-1)
    System.out.println("Searched Item's index: "+pos);
    in.close();
}
}
