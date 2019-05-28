package Tasks4;

public class Task0408 {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //напишите тут ваш код
        if (a > 5) {
            System.out.println("Number more than 5");
        } else if (a < 5) {
            System.out.println("Number less than 5");
        } else {
            System.out.println("The number is 5");
        }

    }
}
