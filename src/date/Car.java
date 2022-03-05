package date;

public final class Car {
    private final int year;
    private final Model model;
    private final String mark;
    private final Engine engine;

    public Car(int year, Model model, String mark, Engine engine) {
        this.year = year;
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(engine);
    }

    public Car() {
        this(0,null,null,null);
    }

    public int getYear() {
        return year;
    }

    public Model getModel() {
        return new Model(model);
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return new Engine(engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model=" + model +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }
}
