package com.ybs.sv.c7;

public class Q27 {

	public static void main(String[] args) {
		Node head =Node.create(3,8,7,1,2,3,4,5);
		Node node=head;
		Node node1=null;
		while(node.next!=null){
			if(node.value==1){
				node1=node;
			}
			node=node.next;
		}
		node.next=node1;

		
		System.out.print(m(head));
	}

	private static int m(Node head) {
		Node slow=head;
		if(slow==null ||slow.next==null){
			return 0;
		}
		Node fast=head.next.next;
		while(fast!=null){
			if(slow==fast){
				return getLength(fast);
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return 0;
	}

	private static int getLength(Node fast) {
		Node current=fast;
		int l=0;
		do{
			l++;
			fast=fast.next;
		}while(current!=fast);
		return l;
	}
}
