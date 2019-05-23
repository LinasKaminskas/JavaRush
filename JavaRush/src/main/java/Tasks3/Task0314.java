package Tasks3;

public class Task0314 {
    public static void main(String[] args) {
        try {
            int i = 1;
            while (i < 10) {
                System.out.println((i) + "  " + (i * 2) + "  " + (i * 3) + "  " + (i * 4) + "  " + (i * 5) + "  " + (i * 6) + "  " + (i * 7) + "  " + (i * 8) + "  " + (i * 9));
                i++;
            }
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong");
        }
    }
}
