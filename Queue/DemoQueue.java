package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(4);
        queue.add(11);
        System.out.println("Poll : " + queue.poll());
        System.out.println("Remove : " + queue.remove());
        System.out.println("Queue : " + queue);
    }
}
