package Tasks3;

public class Task0312 {
    public static int converterToSeconds(int hour) {
        int seconds = hour * 60*60;
        return seconds;
    }

    public static void main(String[] args) {
        System.out.println(converterToSeconds(1));
        System.out.println(converterToSeconds(20));
    }
}
