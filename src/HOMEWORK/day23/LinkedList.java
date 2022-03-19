package HOMEWORK.day23;

public class LinkedList implements List {
    private int size;
    Node head;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("exception1");
        }

        Node node = head;
        for (int i = 0; i < index + 1 ; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
            size++;
        }

    public void add(int val, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("exception2");
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        node.next = new Node(val, node.next);
        size++;


    }

    public void delete(int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("deleteException");
        }
        if (index == 0) {
            head = head.next;
        }else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node curr = head;
        if (curr == null){
            throw new IndexOutOfBoundsException("exception3");
        }while (curr != null){
            stringBuilder.append(curr.val).append(" -> ");
            curr = curr.next;
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }


   private class Node {
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }

    }
}
