package Tasks2;

public class task0213 {
    public static void main(String[] args) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            Fish fish = new Fish();
            Women women = new Women();

            cat.owner = women;
            dog.owner = women;
            fish.owner = women;

    }

    public static class Cat {
        public Women owner;
    }

    public static class Dog {
        public Women owner;

    }

    public static class Fish {
        public Women owner;

    }

    public static class Women {

    }

}
