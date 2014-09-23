package com.ybs.sv.c16;

public class Q122 {

	public static void main(String[] args) {
		int k=5;
		
		int l=1;
		int r=1;
		int mount=0;
		for(int i=2 ; i<=k; i++){
			mount=l+r;
			r=l;
			l=mount;
			
		}
		System.out.print(mount);
	}

}
