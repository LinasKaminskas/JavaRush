package Tasks1;

import java.util.ArrayList;

public class task0114 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String string = "JavaRush. Learn once - use anywhere";
        for (int i = 0; i < 10; i++) {
            list.add(string);
        }
        for (String s : list)
            System.out.println(s);
    }
}
