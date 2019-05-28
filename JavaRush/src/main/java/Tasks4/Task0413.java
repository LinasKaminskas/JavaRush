package Tasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0413 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string = reader.readLine();
            int number = Integer.valueOf(string);
            if (number == 1)
                System.out.println("Monday");
            else if (number == 2)
                System.out.println("Tuesday");
            else if (number == 3)
                System.out.println("Wednesday");
            else if (number == 4)
                System.out.println("Thursday");
            else if (number == 5)
                System.out.println("Friday");
            else if (number == 6)
                System.out.println("Saturday");
            else if (number == 7)
                System.out.println("Sunday");
            else if (number < 1 || number > 7)
                System.out.println("there is no such day of the week");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
