package Tasks3;

import java.util.ArrayList;
import java.util.List;

public class Task0309 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2 + a;
        int c = 3 + b;
        int d = 4 + c;
        int e = 5 + d;

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        for (int s : list)
            System.out.println(s);
    }
}
