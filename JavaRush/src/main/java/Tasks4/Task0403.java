package Tasks4;

public class Task0403 {
    private String name = "nameless cat";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Task0403 cat = new Task0403();
        cat.setName("Zhuzhik");
        System.out.println(cat.name);
    }

}
