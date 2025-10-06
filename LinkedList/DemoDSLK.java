package LinkedList;

public class DemoDSLK {
    public static void main(String[] args) {
        MyDSLK myDS = new MyDSLK();
        // head = null
        // tail = null
        // size = 0

        Node node12 = new Node(12);
        Node node99 = new Node(99);
        Node node37 = new Node(37);

        node12.next = node99;
        node99.next = node37;
        node37.next = null;
        // nút đầu của DSLK
        myDS.head = node12;
        myDS.tail = node37;
        myDS.size = 3;

        // In danh sách liên kết
        myDS.printDSLK();
    }
}
