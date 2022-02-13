package HOMEWORK.Day4;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {

    }

    public void method() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}

