package com.ybs.sv.c17;

public class Q134 {

	public static void main(String[] args) {
		System.out.println(m(81,2));
		System.out.println(m(10,3));
		System.out.println(m(12,5));
	}

	private static int m(int a, int b) {
		int t=b;
		int v=a;
		int r=1;
		int rr=0;
		
		while(v>=t){
			t=t<<1;
			r=r<<1;
		}
		
		t=t>>1;
		r=r>>1;
		v-=t;
		rr=r;
		
		while(v>=b){
			while(v<t){
				t=t>>1;
				r=r>>1;
			}
			rr+=r;
			v-=t;
		}
		
		
		return rr;
		
	}

}
