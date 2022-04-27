package HOMEWORK.creational.task3;

public class ShapeFactory {
    public ShapeCount count(String body) {
        return switch (body) {
            case "triangle" -> new Triangle();
            case "circle" -> new Circle();
            default -> (ShapeCount) new IllegalArgumentException();
        };
    }
}
