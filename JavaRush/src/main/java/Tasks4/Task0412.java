package Tasks4;

import java.util.Scanner;

public class Task0412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sNumber = scanner.nextLine();
        int number = Integer.valueOf(sNumber);
        if (number > 0)
            System.out.println(number * 2);
        else if (number < 0)
            System.out.println(number + 1);
        else if (number == 0)
            System.out.println(0);
    }
}
