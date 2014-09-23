package com.ybs.sv.c8;

public class Q33 {

	private static Node head;
	private static boolean isLeft = true;

	public static void main(String[] args) {
		Node n31 = new Node(1);
		Node n32 = new Node(4);
		Node n34 = new Node(9);

		Node n21 = new Node(n31, n32, 3);
		Node n22 = new Node(null, n34, 7);

		Node n11 = new Node(n21, n22, 5);

		m(n11);

		Node node = head;
		do {
			System.out.print(node.value);
			node = node.right;
		} while (node != head);
	}

	private static void m(Node node) {
		head = node;
		add(node);

	}

	private static void add(Node node) {

		Node left = node.left;
		Node right = node.right;

		if (left != null) {
			if (isLeft) {
				head = left;
			}
			add(left);

		} else {
			isLeft = false;
		}

		if (head == node) {
			head.left = head;
			head.right = head;
		} else {
			node.left = head.left;
			node.right = head;
			head.left.right = node;
			head.left = node;
		}

		if (right != null) {
			add(right);
		}
	}

}
