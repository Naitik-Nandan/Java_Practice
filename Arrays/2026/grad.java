    import java.util.Scanner;
    public class grad {
        public static void main(String[] args) {
            
            int ar [] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
            System.out.println("ENter Number to be searched");
            Scanner in = new Scanner(System.in);
            int sn = in.nextInt();
            int s =0, e=0, mid=0,k=-1;
            e=9;
            while(s<=e){
                mid = (s+e)/2;
                if(ar[mid] == sn){
                    k=1;
                    break;
                }
                if(ar[mid]<sn)
                    s=mid+1;
                if(ar[mid]>sn)
                    e=mid-1;
            }
            if(k==1)
                System.out.println("Number found at index: "+((s+e)/2));
            else
                System.out.println("Number not found");
        }
    }
