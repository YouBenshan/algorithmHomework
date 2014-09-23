package com.ybs.sv.c10;

import java.util.Arrays;

public class Q61 {

	public static void main(String[] args) {
		int[] a={-2,1,-1,2,1,3,4,-5,6,9,-8,-5,-3,0,0,-5,-10,0,2,6};
		
		m(a);
		
	}

	private static void m(int[] a) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int mid=getMid(a);
		System.out.println(mid);
		
		

		for(int i=0; i<=mid; i++){
			int j=mid+1;
			int k=a.length-1;
			if(i>0 && a[i]==a[i-1]){
				i++;
				continue;
			}
			while(j<k)
				if(a[i]+a[j]+a[k]>0){
					k--;
				}else if(a[i]+a[j]+a[k]<0){
					j++;
				}else{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					j++; 
					k--;
					while(j>mid+1 && a[j]==a[j-1]){
						j++;
					}
				}
		}
		
		for(int i=mid+1; i<=a.length-1; i++){
			int j=0;
			int k=mid;
			if(a[i]==a[i-1]){
				i++;
				continue;
			}
			while(j<k)
				if(a[i]+a[j]+a[k]>0){
					k--;
				}else if(a[i]+a[j]+a[k]<0){
					j++;
				}else{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					j++;k--;
					while(j>0&&a[j]==a[j-1]){
						j++;
					}
				}
		}
		
		
		
	}

	private static int getMid(int[] a) {
		
		int start=0;
		int end=a.length-1;
		int i=(start+end)>>1;
		
		while(a[i]*a[i+1]>0){
			i=(start+end)>>1;
			if(a[i]<0){
				start=i+1;
			}else{
				end=i;
			}
		}
		while(a[i-1]==0){
			i--;
		}
		return i;		
	}

}
