package com.ybs.sv.c8;

public class Q34 {
	public static void main(String[] args) {
		Node root =new Node(new Node(new Node(1), new Node(4), 3), new Node(null, new Node(9), 7),5);
		
		int i=1;
		int j=7;
		m(root, i, j);
	}

	private static void m(Node node, int i, int j) {
		if(i<node.value && node.value<j){
			System.out.print(node.value);
		}else if(i>node.value){
			node=node.right;
			m(node,i,j);
		}else{
			node=node.left;
			m(node,i,j);
		}
	}
}
