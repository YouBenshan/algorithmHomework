package com.ybs.sv.c8;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Node {
	Node left;
	Node right;
	int value;

	public Node(Node left, Node right, int value) {
		this.left = left;
		this.right = right;
		this.value = value;
	}

	public Node(int value) {
		this.value = value;
	}

	public Node() {
	}

	public static void printPre(Node node) {
		if (node != null) {
			System.out.print(node.value);
			printPre(node.left);
			printPre(node.right);
		}

	}

	public static void printMid(Node node) {
		if (node != null) {
			printMid(node.left);
			System.out.print(node.value);
			printMid(node.right);
		}
	}

	public static void printPost(Node node) {
		if (node != null) {
			printPost(node.left);
			printPost(node.right);
			System.out.print(node.value);
		}

	}

	public static void printLayer(Node node) {
		int k = 1;
		Queue<Node> queue = new LinkedBlockingQueue<>();
		queue.add(node);
		boolean notAllNull = true;

		while (notAllNull) {
			notAllNull = false;
			for (int i = 0; i < k; i++) {
				Node n = queue.poll();

				if (n == NillNode.instance) {
					System.out.print("nill");
					queue.add(NillNode.instance);
					queue.add(NillNode.instance);
				} else {
					System.out.print(n.value);
					if (n.left == null) {
						queue.add(NillNode.instance);
					} else {
						notAllNull = true;
						queue.add(n.left);
					}
					if (n.right == null) {
						queue.add(NillNode.instance);
					} else {
						notAllNull = true;
						queue.add(n.right);
					}
				}
			}
			System.out.println();
			k = k << 1;
		}

	}

	public static void main(String[] args) {

		Node n31 = new Node(1);
		Node n32 = new Node(4);
		Node n34 = new Node(9);

		Node n21 = new Node(n31, n32, 3);
		Node n22 = new Node(null, n34, 7);

		Node n11 = new Node(n21, n22, 5);

		printLayer(n11);
	}

}