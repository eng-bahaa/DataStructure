package bahaeldin.ds.com.node;

public class Node {
	private int value;
	private Node next;

	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void printNode() {
		System.out.println("Node value: " + this.value);
	}

	public void printNodeAndNext() {
		System.out.println("Node value: " + this.value + " Next node value: " + this.next.getValue());
	}
}
