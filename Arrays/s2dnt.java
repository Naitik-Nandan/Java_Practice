import java.util.*;
public class s2dnt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ar[][] = new String [2] [10];
        System.out.println("Ener Details");
        for (int i =0; i<2; i++) {
            for (int j =0; j<8; j++) {
                ar[i][j] = in.nextLine();
                if(j==7){
                    int s1 = Integer.parseInt(ar[i][2]);
                    int s2 = Integer.parseInt(ar[i][3]);
                    int s3 = Integer.parseInt(ar[i][4]);
                    int s4 = Integer.parseInt(ar[i][5]);
                    int s5 = Integer.parseInt(ar[i][6]);
                    int s6 = Integer.parseInt(ar[i][7]);
                    double percent = ((s1+s2+s3+s4+s5+s6)/600.0)*100;
                    ar[i][8] = String.format("%.2f", percent)+"%";
                    if(percent>=80 && percent<=100)
                        ar[i][9]="A";
                    if(percent>=60 && percent<=79)
                        ar[i][9]="B";
                    if(percent>=40 && percent<=59)
                        ar[i][9]="C";
                    if(percent<40)
                        ar[i][9]="D";
                }
            }
        }
        System.out.printf("%-10s %-12s %-10s %-10s %-10s %-12s %-12s %-10s %-12s %-6s%n",
            "Roll No.", "Name", "English", "Hindi", "Maths", "Computer", "Science", "HCG", "Percentage", "Grade");
        for(int i = 0; i<2; i++) {
            System.out.printf("%-10s %-12s %-10s %-10s %-10s %-12s %-12s %-10s %-12s %-6s%n",
                ar[i][0], ar[i][1], ar[i][2], ar[i][3], ar[i][4],
                ar[i][5], ar[i][6], ar[i][7], ar[i][8], ar[i][9]);
        }
        in.close();
    }
}
