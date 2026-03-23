import java.util.*;
public class magic {
    private void Magic(String str){
        int k = -1;
        for(int i = 0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if((int)ch2 == (int)ch+1)
                k=1;
        }
        if(k==1)
            System.out.println("It is a Magic String");
        else System.out.println("It is not a Magic String");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Word");
        String st = in.nextLine();
        magic ob = new magic();
        ob.Magic(st);
        in.close();
    }
}
