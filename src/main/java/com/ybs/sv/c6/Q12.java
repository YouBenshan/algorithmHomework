package com.ybs.sv.c6;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q12 {

	public static void main(String[] args) {
		int[] a = { 1, 7, 2, 4, 2, 5, 10, 7, 4, 4, 5, 2, 3};
		int k = 10;

		m(a, k);
			m1(a, k);
		

	}

	private static void m(int[] a, int k) {

		Queue<Integer> queue = new PriorityQueue<>();
		for (int i : a) {
			queue.add(i);
		}

		for (int i = 0; i < k; i++) {
			System.out.print(queue.poll());
		}
	}

	private static void m1(int[] a, int k) {
		int start = 0;
		int end = a.length - 1;



		while (0<k && k<a.length) {
			int pivot = a[end];
			int i = start;
			int j = end - 1;
			
			while (i < j) {

				while (a[i] <= pivot && j > i) {
					i++;
				}
				while (a[j] > pivot  && j > i) {
					j--;
				}

				if (i != j) {
					swap(a, i, j);
				}
			}

			if (a[i]>pivot) {
				swap(a, i, end);
			}
			if (k>i+1) {
				start = i + 1;
			} else if(k<i) {
				end = i - 1;
			} else {
				break;
			}
			
			
		}
		System.out.println(Arrays.toString(a));
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
