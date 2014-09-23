package com.ybs.sv.c6;

public class Q14 {
	public static void main(String[] args) {
		int[] a = { 1,2,4,5,7,9,14,16,18,22,33,57,67,68,69,99};
		int[] b = { 1,2,3,4,5,6,7,8,9,22,33,44,55,66,77,88,100,200};
		int k=33;
		m(a,b,k);

	}

	private static void m(int[] a, int[] b, int k) {
		int start=0;
		int end=k-2;
		
		if(k<=2 || k>=(a.length+b.length)){
			return;
		}
		if(a[a.length-1]<b[k-a.length]){
			System.out.print(b[k-a.length-1]);
			return;
		}
		
		if(b[b.length-1]<a[k-b.length]){
			System.out.print(a[k-b.length-1]);
			return;
		}
		
		while(true){
			int i=(start+end)>>1;
			
			if(i+2>=a.length){
				i=a.length-2;
			}
			int j=k-3-i;
			if(a[i+1]>=b[j] && b[j+1]>=a[i]){
				if(a[i+1]>=b[j+1]){
					System.out.print(b[j+1]);
				}else{
					System.out.print(a[i+1]);
				}
				break;
			}else{
				if(a[i+1]<b[j]){
					start=i;
				}else{
					end=i;
				}
			}
		}
		
	}
}
