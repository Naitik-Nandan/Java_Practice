import java.util.*;
public class Security{

    String n;
    int h;
    double w;
    /*void get (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Security Personnels needed, number of hours, rate, wage");
        n=in.nextLine();
        h=in.nextInt();
        //r=in.nextDouble();
        in.close();
    }*/
   Security(String name, int hours){
    n=name;
    h=hours;
   }
    void calwage(){
        if(h<=70){
            if(h<=40)
                w=h;
            else if(h>40&&h<=60)
                w=40+(h-40)*1.5;
            else if(h>60)
                w=40+30+(h-60)*2;
        }
        else
            System.out.println("Work Less");
    }
    void display (){
        System.out.println("Name \t Hours \t Wages\n"+n+"\t"+h+"\t"+w);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Security Personnels needed, number of hours, rate, wage");
        String n=in.nextLine();
        int h=in.nextInt();
        //r=in.nextDouble();
        in.close();
        Security ob = new Security(n,h);
        //ob.get();
        ob.calwage();
        ob.display();
        // Using Class_Encyptology inside main — correct place for method calls
        Class_Encyptology bo = new Class_Encyptology();
        bo.input("Hello");
    }
}