package Tasks4;

public class Task0411 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (month == 12 || month == 1 || month == 2)
            System.out.println("Winter");
        else if (month == 3 || month == 4 || month == 5)
            System.out.println("Spring");
        else if (month == 6 || month == 7 || month == 8)
            System.out.println("Summer");
        else if (month == 9 || month == 10 || month == 11)
            System.out.println("Autumn");
    }
}
