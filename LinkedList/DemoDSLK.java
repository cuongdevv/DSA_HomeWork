package LinkedList;

public class DemoDSLK {
		public static void main(String[] args) {
				MyDSLK myDS = new MyDSLK();

				Node node5 = new Node(5);
				Node node10 = new Node(10);
				Node node20 = new Node(20);
				Node node1 = new Node(1);

				node5.next = node10;
				node10.next = node20;
				node20.next = node1;
				node1.next = null;

				myDS.head = node5;
				myDS.tail = node1;

				myDS.size = 4;

				// In danh sách liên kết
				myDS.printDSLK();
				System.out.println(myDS.getRandom());
		}
}
