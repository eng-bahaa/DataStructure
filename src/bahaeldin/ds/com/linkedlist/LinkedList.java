package bahaeldin.ds.com.linkedlist;

import bahaeldin.ds.com.node.Node;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	public LinkedList(int value) {
		Node newNode = new Node(value);
		this.head = newNode;
		this.tail = newNode;
		this.length = 1;
	}

	public int getHead() {
		return head.getValue();
	}

	public int getTail() {
		return tail.getValue();
	}

	public int getLength() {
		return length;
	}

	private void lengthIncrement() {
		this.length++;
	}

	private void lenthDecrement() {
		this.length--;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head.getValue() + ", tail=" + tail.getValue() + ", length=" + length + "]";
	}



}
