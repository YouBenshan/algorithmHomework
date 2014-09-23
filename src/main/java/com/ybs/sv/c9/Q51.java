package com.ybs.sv.c9;

public class Q51 {
	public static void main(String[] args) {
		int k=3;
		m(k);

	}

	private static void m(int k) {
		char[] chars=new char[k*2];
		print(k,k,chars,0);
		
	}

	private static void print(int l, int r, char[] chars, int i) {
		if(l<0 || r<l) {
			return;
		}
		
		if(l==0 && r==0){
			System.out.println(chars);
		}else{
			if(l>0){
				chars[i]='(';
				print(l-1, r , chars, i+1);
			}
			
			if(r>0){
				chars[i]=')';
				print(l, r-1, chars, i+1);
			}
		}
	}
	
	
}
