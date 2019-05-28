package Tasks4;

public class Task0409 {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int c = abs(10 - a);
        int d = abs( 10 - b);
        if (c > d){
            System.out.println(b);
        } else if (c < d){
            System.out.println(a);
        } else System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
