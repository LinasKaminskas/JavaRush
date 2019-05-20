package Tasks2;

import java.util.ArrayList;

public class task0215 {
    public static void print3(String s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 3 ; i++) {
            list.add(s);
        }
        for (String string:list)
            System.out.println(string);
    }

    public static void main(String[] args) {
        print3("I love you");
    }
}
