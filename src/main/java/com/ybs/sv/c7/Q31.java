package com.ybs.sv.c7;

public class Q31 {
	public static void main(String[] args) {
		Node list= Node.create(2,10,14,3,8,99,6,9,9,9,9);
		System.out.println(m(list, 14));

	}

	private static Node m(Node list, int a) {
		Node smallStart=null;
		Node smallEnd=null;
		Node bigStart=null;
		Node bigEnd=null;
		if(list.value<a){
			smallStart=smallEnd=list;
		}
		else{
			bigStart=bigEnd=list;
		}
		
		while(list.next!=null){
			if(list.value<a != list.next.value<a){
				if(list.value>=a){
					if(smallStart==null){
						smallStart=smallEnd=list.next;
					}else{
						smallEnd.next=list.next;
					}
					bigEnd=list;
					list=list.next;
					bigEnd.next=null;
				}else{
					if(bigStart==null){
						bigStart=bigEnd=list.next;

					}else{
						bigEnd.next=list.next;
					}
					smallEnd=list;
					list=list.next;
					smallEnd.next=null;
				}
			}else{
				list=list.next;
			}
		}
		while(smallEnd.next!=null){
			smallEnd=smallEnd.next;
		}
		smallEnd.next=bigStart;
		return smallStart;
	}
}
