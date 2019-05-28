package Tasks4;

import java.util.Scanner;

public class Task0414 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = Integer.valueOf(string);
        if (number % 400 == 0)
            System.out.println(366);
        else if (number % 400 == 0 && number % 100 == 0)
            System.out.println(366);
        else if (number % 100 != 0 && number % 400 !=0 && number % 4 == 0)
            System.out.println(366);
        else if (number % 100 == 0 && number % 400 != 0)
            System.out.println(365);
        else System.out.println(365);

    }
}
