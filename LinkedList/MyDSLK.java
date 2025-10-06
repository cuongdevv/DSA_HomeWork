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

    void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    void removeFirst() {
        head = head.next;
        size--;
    }

    void removeLast() {
        tail = tail.next;
        size--;
    }

    int getFirst() {
        return head.data;
    }

    int getLast() {
        return tail.data;
    }
}
