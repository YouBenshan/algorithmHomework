package com.ybs.sv.c7;

public class Q26 {

	public static void main(String arg[]) {

		Node head1 = Node.create(5, 15, 20, 9, 0, 8);
		Node head2 = Node.create(10, 15, 20, 25);
		System.out.println(head1);
		System.out.println(head2);

		m(head1, head2);

	}

	private static void m(Node head1, Node head2) {
		Node now = head1;
		Node next = head2;
		while (now != null && next != null) {
			Node temp = now.next;
			now.next = next;
			now = now.next;
			next = temp;
		}
		System.out.println(head1);
	}

}
