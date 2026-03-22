public class lcm {
    public static int Glcm(int a, int b) {
        int r = 1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(15*10/(Glcm(15,10)));
    }
}