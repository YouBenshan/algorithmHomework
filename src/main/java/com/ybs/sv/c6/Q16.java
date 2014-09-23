package com.ybs.sv.c6;

public class Q16 {
	public static void main(String[] args) {
		int[] a = { 102,102,102,102,102,103,203,2,4,5,7,9,14,16,18,22,33,57,67,68,69,99,100,101,102,102,102,102,102};
		m(a,0, a.length);
	}

	private static void m(int[] a, int start, int end) {
		int mid=(start+end)/2;
		if(mid==start){
			if(a[mid]>a[end]){
				System.out.print(a[end]);
			}
			return;
		}
		if(a[start]>a[mid]){
			m(a,start, mid);
		}else if(a[mid]>a[end-1]){
			m(a, mid, end);
		}else{
			m(a,start, mid);
			m(a, mid, end);
		}
	}
}
