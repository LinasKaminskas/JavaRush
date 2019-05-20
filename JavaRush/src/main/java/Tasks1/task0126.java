package Tasks1;

import java.util.ArrayList;

public class task0126 {
    public static void main(String[] args) {
        String string = "Do you want - solve problems, do not want - solve reluctantly";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 16 ; i++) {
            list.add(string);
        }
        for (String s : list)
            System.out.println(s);
    }
}
