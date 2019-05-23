package Tasks2;

public class Task0207 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman;
        woman.husband = man;

    }
    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }
    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
