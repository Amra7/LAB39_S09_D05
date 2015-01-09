package vjezbe;

public class LinkedList<T> {

	private Node head;
	private int size;

	public void add(T value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}
	
	public void add(T value, int index){
		if (index < 0 || index > size){
			throw new IndexOutOfBoundsException("Nema tog indexa");
		}
		Node newNode = new Node(value);
		Node current = head;
		if (index ==0){
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		if( index == size){
			add(value);
			size++;
			return;
		}
		
		current = head.next;
		Node prev=  head;
		int counter = 1;
		while( counter < index){
			prev = prev.next;
			current = current.next;
		}
		prev.next=newNode;
		newNode.next=current;
		size++;
		
	}

	/***
	 * Remove elements from linked list.
	 * 
	 * @param offset
	 *            - index of element that we want to remove.
	 */
	public void remove(int offset) {
		if (offset < 0 || offset >= size) {
			throw new IndexOutOfBoundsException("Out of bound");
		}

		Node current = head;
		if (offset == 0) {
			head = current.next;
			size--;
			return;
		}

		current = head.next;
		Node prev = head;
		int counter = 1;
		while (counter < offset) {
			prev = prev.next;
			current = current.next;
			counter++;

		}
		prev.next = current.next;
		current = null;
		size--;

	}

	/**
	 * Return all elements of linked list to String.
	 */
	public String toString() {
		String str = "";
		str += "[";
		Node current = head;
		while (current != null) {
			str += current.value;
			if (current.next != null) {
				str += ", ";
			}
			current = current.next;
		}
		str += "]";

		return str;
	}

	// end of Linked list class

	/**
	 * Node class
	 * 
	 * @param offset
	 *            - new offset that we set.
	 */
	private class Node<T> {
		public T value;
		public Node next;

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

	}
}
