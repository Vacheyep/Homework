package date;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(2101,
                new Model(14,"m"),
                "BMW",
                new Engine(822,2000,1500)
        );

        System.out.println(bmw);
    }
}
