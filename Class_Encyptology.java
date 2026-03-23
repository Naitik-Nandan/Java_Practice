public class Class_Encyptology {
    String s,str;
    Class_Encyptology(){
        s="ABC";
        str="";
    }
    void input(String st){
    s=st;
    }
    void perform (int move) {
        int l=0;
        l = s.length();
        for (int i=0 ; i<l ; i++) {
            char ch = s.charAt(i);
            //ch=(char)((int)ch+move);
            if((int)ch+move>70)
                ch=(char)((int)ch+move-26);
            else if(ch<65)
                ch=(char)((int)ch+move+26);
            else 
                ch=(char)((int)ch+move);
            str+=ch;
        }
    }
    void Display () {
        System.out.println("Encrypted String: "+str);
    }
   public static void main(String[] args) {
        Class_Encyptology ob = new Class_Encyptology();
        ob.input("ABZ");
        ob.perform(2);
        ob.Display();
    } 
    
}
