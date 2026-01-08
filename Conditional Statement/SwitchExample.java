import java.util.*;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
        System.out.println("Choose Your Choice: Cube / Cuboid / Sphere");
        choice = in.nextLine();
        double vol = 0;
        switch (choice) {
            case "Cube":
                int s;
                System.out.println("Enter Side of the Cube");
                s = in.nextInt();
                vol = s*s*s;
                break;
            case "Sphere":
                int r;
                System.out.println("Enter the Radius of the Sphere");
                r = in.nextInt();
                vol = (4/3) * (22/7) * r *r *r;
                break;
            case "Cuboid":
                int l, b, h;
                System.out.println("Enter the Length, Breadth and Height of the Cuboid, one by one");
                l = in.nextInt();
                b = in.nextInt();
                h = in.nextInt();
                vol = l * b * h;
                break;
            default:
                System.out.println("Invlid Option");
        }
        System.out.println("Volume of "+choice +" :"+ vol);
        in.close();
    }
}