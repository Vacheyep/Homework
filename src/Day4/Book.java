package Day4;

public class Book {
    String name;
    Author author;
    int price;
    public Book(String name, Author author, int price){
        this.name = name;
        this.author = author;
        this.price = price;

    }
    public void MetBook(){
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);

    }
}