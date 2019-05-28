package Tasks3;

public class Task0322 {
    private static int getMetreFromCentimetre(int centrimetre){
        int centimetre = centrimetre / 100;
        return centimetre;
    }
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }
}
