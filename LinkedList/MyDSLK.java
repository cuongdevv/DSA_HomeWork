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

		void removeLast() { // O(n)
				Node current = head;
				while (current.next != tail) {
						current = current.next;
				}
				current.next = null;
				tail = current;
				size--;
		}

		int getFirst() { // O(1)
				return head.data;
		}

		int getLast() { // O(1)
				return tail.data;
		}

		// Lấy ra một nút bất kỳ (không phải đầu và cuối danh sách)
		// Độ phức tạp là O(n) vì phải duyệt qua danh sách để tới vị trí bất kỳ.
		int getRandom() {
			if (size <= 2) {
					throw new IllegalStateException("Danh sách quá ngắn, không có nút ở giữa!");
			}
			int randomIndex = 1 + (int)(Math.random() * (size - 2)); // từ 1 đến size-2 (bỏ qua head và tail)
			Node current = head;
			for (int i = 0; i < randomIndex; i++) {
				current = current.next;
			}	
			return current.data;
		}
}
