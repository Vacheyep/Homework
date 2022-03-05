package HOMEWORK.day21.task3;

public abstract class Cat extends Animal{
    public Cat() {
    }

    public void sound(){

    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
