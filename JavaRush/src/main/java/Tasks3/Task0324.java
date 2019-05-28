package Tasks3;

public class Task0324 {
    public static int sumDigitsNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigitsNumber(546));
    }
}
