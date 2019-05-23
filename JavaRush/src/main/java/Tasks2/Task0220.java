package Tasks2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task0220 {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        List<Integer> list2 = new ArrayList<>();
        list2.add(c);
        list2.add(d);
        int minimal2 = Collections.min(list2);
        int minimal3 = min(a, b);
        if (minimal2 > minimal3) {
            return minimal3;
        } else
        return minimal2;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        List<Integer> list1 = new ArrayList<>();
        list1.add(a);
        list1.add(b);
        int minimal1 = Collections.min(list1);
        return minimal1;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
