package HOMEWORK.day23;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList() {};


        linkedList.add(4);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(2);
        linkedList.add(10,2);
        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());

        linkedList.delete(0);
        linkedList.delete(0);
        linkedList.delete(1);


        System.out.println();

        System.out.println(linkedList.toString());
 }
}
