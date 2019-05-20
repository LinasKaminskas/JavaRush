package Tasks2;

public class task0206 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFarenheit(41));
    }
    public static double convertCelsiumToFarenheit(int celsium){

        double TF = celsium * 9 / 5.0 + 32;
        // or TF = 9 * (celsium / 5) + 32;

        return TF;
    }
}
