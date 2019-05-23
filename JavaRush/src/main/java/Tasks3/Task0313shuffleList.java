package Tasks3;

import java.util.*;

public class Task0313shuffleList {
    public static void main(String[] args) {
        String a = "Mom";
        String b = "Washed";
        String c = "Frame";

        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        for (int i = 0; i < 6; i++) {
            Collections.shuffle(list);
            System.out.println(list);

        }
    }

}
