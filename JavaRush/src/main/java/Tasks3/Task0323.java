package Tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0323 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            System.out.println(name + " + " + name1 + " + " + name2 + " = " + " Pure love, yes, yes!" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
