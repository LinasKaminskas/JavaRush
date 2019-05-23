package Tasks2;

import java.util.ArrayList;
import java.util.List;

public class Task0217 {
    public static void print3(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(s);
            System.out.print(" " + s + " ");
        }
    }


    public static void main(String[] args) {
            print3("window");
            print3("file");
    }
}
