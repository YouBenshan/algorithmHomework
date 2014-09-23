package com.ybs.sv.c6;

public abstract class Q15 {
	public static void main(String[] args) {
		int[] a = { 1,2,4,5,7,9,14,16,18,22,33,57,67,68,69,99,100,101,102,102,102,102,102,102,102,102,102,102,103};
		int[] b = { 1,2,3,4,5,6,7,8,9,22,33,44,55,66,77,88,100,200};
		int k=(a.length+b.length+1)>>1;
		int v=m(a,b,k);
		System.out.print(v);
	}

	private static int m(int[] a, int[] b, int k) {
		if(a.length<b.length){
			return m(b,a,k);
		}
		
		int start=0, end=a.length;
		while(start<end){
			int i= (start+end)>>1;
			int j= k-1-i;
			
			if(j>b.length-1){
				start=i+1;
			}else{
				if(a[i]<b[j]){
					start=i+1;
				}else{
					end=i;
				}
			}
		}
		int ai=a[start-1];
		int bj=Integer.MIN_VALUE;
		if(k-start-1<b.length-1){
			bj=b[k-start-1];
		}
		
		return Math.max(ai,bj);
	}
	
	
	
}
