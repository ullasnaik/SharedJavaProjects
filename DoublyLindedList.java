class Node {
	protected Node previous;
	protected Node Next;
	protected int val;

	public Node() {
	}

	public Node(Node previous, Node next, int val) {
		super();
		this.previous = previous;
		this.Next = next;
		this.val = val;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		Next = next;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

}

public class DoublyLindedList {
	private Node head;
	private Node last;
	private int size = 0;

	public void addFirst(int val) {
		Node newNode = new Node(null, null, val);
		if (head == null) {
			head = newNode;
			last = newNode;
			size++;
		} else {
			Node temp = head;
			head.setPrevious(newNode);
			head = newNode;
			newNode.setNext(temp);
			size++;
		}
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("Linked List is Empty !!!");
		} else {
			Node temp = head.getNext();
			head = null;
			head = temp;
			head.setPrevious(null);
			size--;
		}
	}

	public void addLast(int val) {
		Node newNode = new Node(null, null, val);
		if (head == null) {
			head = newNode;
			last = newNode;
			size++;
		} else {
			Node temp = this.last;
			last.setNext(newNode);
			last = newNode;
			last.setPrevious(temp);
			size++;
		}

	}

	public void removeLast() {
		if (head == null) {
			System.out.println("Linked List is Empty !!!");
		} else {
			Node temp = last.getPrevious();
			last = temp;
			last.setNext(null);
			size--;
		}
	}

	public void addAtPos(int pos, int val) {
		Node newNode = new Node(null, null, val);
		if (size > pos) {
			if (head == last) {
				addFirst(val);
			} else {
				Node temp = head;
				while (pos > 0) {
					temp = temp.getNext();
					pos--;
				}
				Node temp1 = temp.getNext();
				temp.setNext(newNode);
				temp1.setPrevious(newNode);
				size++;
			}
		} else {
			System.out.println("Linked List Size is less than given postion");
		}

	}

	public void removeAtPos(int pos) {
		if (size > pos) {
			if (head == last) {
				removeFirst();
			} else {
				Node temp = head;
				while (pos > 0) {
					temp = temp.getNext();
					pos--;
				}
				Node temp2 = temp.getNext();
				Node temp1 = temp.getPrevious();
				temp2.setPrevious(temp1);
				temp1.setNext(temp2);
				size--;
			}
		} else {
			System.out.println("Linked List Size is less than given postion");
		}

	}

}
