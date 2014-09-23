package com.ybs.sv.c7;

public class Node {

	int value = 0;
	Node next = null;

	public Node(int value) {
		this.value = value;
	}

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	public static Node create(int... values) {
		Node head = new Node(values[0]);
		Node preNode = head;
		for (int i = 1; i < values.length; i++) {
			Node n = new Node(values[i]);
			preNode.next = n;
			preNode = n;

		}

		return head;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(value);
		Node now = next;
		while (now != null) {
			sb.append(", ").append(now.value);
			now = now.next;

		}
		return sb.toString();
	}

}
