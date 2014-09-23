package com.ybs.sv.c7;

public class Q28 {
	
	
	private static Node temp=null;

	public static void main(String[] args) {
		Node head=Node.create(1,2,3,4);
//		m(head);
		
		m1(head,head.next);
		head.next=null;
		System.out.println(temp);
	}

	private static void m1(Node node, Node next) {
		if(next!=null){
			m1(next,next.next);
			next.next=node;
		}else{
			temp=node;
		}
	}

	private static void m(Node head) {
		if(head==null) {
			return;
		}
		Node pre = head;
		Node current = head.next;
		while(current!=null){
			Node post=current.next;
			current.next=pre;
			pre=current;
			current=post;
		}
		
		head.next=null;

		System.out.println(pre);
	}

}
