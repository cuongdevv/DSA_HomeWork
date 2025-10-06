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

		void printDSLK() { // O(n)
				Node current = head;
				while (current != null) {
						System.out.print(current.data + " -> ");
						current = current.next;
				}
				System.out.println("null");
		}

		void insertFirst(int data) { // O(1)
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

		void removeFirst() { // O(1)
				head = head.next;
				size--;
		}

		void removeLast() { // O(1)
				tail = tail.next;
				size--;
		}

		int getFirst() { // O(1)
				return head.data;
		}

		int getLast() { // O(1)
				return tail.data;
		}
}
