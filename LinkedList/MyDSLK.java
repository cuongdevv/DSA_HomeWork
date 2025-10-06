package LinkedList;

public class MyDSLK {
    Node head;
    Node tail;
    int size;

    MyDSLK() {
        head = null;
        tail = null;
        size = 0;
    }

    void printDSLK() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
