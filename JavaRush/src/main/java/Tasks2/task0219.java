package Tasks2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task0219 {
    public static int min(int a, int b, int c) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        return Collections.min(list);

    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
