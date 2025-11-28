package bahaeldin.ds.com;

import bahaeldin.ds.com.linkedlist.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList(4);
		System.out.println(myLinkedList.getHead());
		System.out.println(myLinkedList.getTail());
		System.out.println(myLinkedList.getLength());

		myLinkedList.printList();
		System.out.println(myLinkedList);

	}

}
