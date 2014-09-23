package com.ybs.sv.c7;

public class Q30 {

	public static void main(String[] args) {
		Node list1= Node.create(2,4,6,9,9,9,9);
		Node list2 = Node.create(5,6,4);
		System.out.println(m(list1,list2));

	}

	private static Node m(Node list1, Node list2) {
		Node n1=list1;
		Node n2 = list2;
		
		int v=list1.value+list2.value;
		
		Node n=Node.create(v%10);
		Node head=n;
		int carry=v/10;
		while(true){
			v=carry;
			if(n1!=null && (n1=n1.next)!=null){
				v=v+n1.value;
			}
			if(n2!=null &&  (n2=n2.next)!=null){
				v=v+n2.value;
			}
			if(v==0){
				break;
			}
			n.next=new Node(v%10);
			carry=v/10;
			n=n.next;
		}
		
		return head;
	}

}
