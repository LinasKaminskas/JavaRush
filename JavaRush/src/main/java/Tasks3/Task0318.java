package Tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task0318 {
    public static void main(String[] args) {

        System.out.println("Please enter name : ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please enter age: ");
        String age = scanner.nextLine();
        System.out.println(name + " will take over the wold " + age + "." + " Mu cha cha");

        System.out.println("Please enter name : ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name1 = reader.readLine();
            System.out.println("Please enter age: ");
            String age1 = reader.readLine();
            System.out.println(name1 + " will take over the wold " + age1 + "." + " Ma chu chu");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
