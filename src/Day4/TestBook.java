package Day4;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Girq1",new Author("Ananun","ananun@gmail.com",'M'),500);
        Book book2 = new Book("Girq2",new Author("Ananun","ananun@gmail.com",'M'),600);
        book1.MetBook();
        book2.MetBook();
    }
}
