package Tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0320 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            System.out.println(name + " earns $5,000. Ha - ha - ha");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
