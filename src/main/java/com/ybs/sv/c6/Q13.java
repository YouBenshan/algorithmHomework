package com.ybs.sv.c6;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		int[] a = { 1, 7, 2, 4, 2, 5, 10, 7, 4,1,3,2, 4, 5, 2, 3};
		int k =50;

		m(a,k);

	}

	private static void m(int[] a, int k) {
		partition(a,k,0,a.length-1);
		
	}
	
	private static void partition(int[] a, int k , int start, int end) {
		if(end-start<2){
			if(a[end]+a[start]<k){
				System.out.print("total is small");
			}else{
				if(a[start]>=k){
					swap(a,start,end);
					System.out.print(Arrays.toString(Arrays.copyOfRange(a, end, a.length)));
				}
				else if(a[end]>=k){
					System.out.print(Arrays.toString(Arrays.copyOfRange(a, end, a.length)));
				}else{
					System.out.print(Arrays.toString(Arrays.copyOfRange(a, start, a.length)));
				}
			}
		}else{
			int mid=mid(a,start, end);
			int i=start;
			int j=end-1;
			
			int mount=a[end];
			
			while(true){
				while(a[++i]<mid){};
				while(a[--j]>mid){mount=mount+a[j];};
			
				if(i<j){
					swap(a,i,j);
					mount=mount+a[j];
				}else{
					swap(a, i, end-1);
					break;
				}
			}
			if(mount+mid<k){
				partition(a,k-mount-mid,start,i-1);
			}else{
				if(mount>=k){
					partition(a,k,i+1,end);
				}else{
					System.out.print(Arrays.toString(Arrays.copyOfRange(a, i, a.length)));
				}
			}
		}
		
	}
	
	
	private static int mid(int[] a, int start, int end){
		int midIndex=(start+end)>>1;
		if(a[start]> a[midIndex]){
			swap(a,start,midIndex);
		}
		if(a[midIndex]>a[end]){
			swap(a, midIndex,end);
		}
		if(a[start]> a[midIndex]){
			swap(a,start,midIndex);
		}
		
		swap(a,midIndex,end-1);
		return a[end-1];
	}

	private static void swap(int[] a, int i, int midIndex) {
		int temp=a[i];
		a[i]=a[midIndex];
		a[midIndex]=temp;
	}

}
