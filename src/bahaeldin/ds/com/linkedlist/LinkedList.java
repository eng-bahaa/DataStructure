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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}


}
