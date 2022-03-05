package HOMEWORK.day21.task3;

public class Main {
    public static void main(String[] args) {
            Animal cat = new Cat() {
                @Override
                public void sound() {
                    super.sound();
                }
            };
            Cat cat1 = new Cat() {
                @Override
                public void sound() {
                    super.sound();
                }
            };
        System.out.println(cat);
        System.out.println(cat1);
    }
}
