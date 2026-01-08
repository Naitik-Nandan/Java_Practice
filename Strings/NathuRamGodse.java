package Strings;

import java.util.*;

public class NathuRamGodse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fn, sn, st1 = "";
        int p;
        System.out.println("Enter Your Full Name");
        fn = in.nextLine();
        fn = ' ' + fn;
        p = fn.lastIndexOf(' ');
        sn = fn.substring(p);
        for (int i = 0; i < p; i++) {
            char ch = fn.charAt(i);
            if (ch == ' ') {
                st1 = st1 + fn.charAt(i + 1) + '.';
            }
        }
        System.out.println(st1);
        fn = st1.concat(sn);
        System.out.println(fn);
        in.close();
    }
}
