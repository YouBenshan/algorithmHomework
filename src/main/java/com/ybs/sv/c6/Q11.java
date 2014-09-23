package com.ybs.sv.c6;

import java.util.Random;

public class Q11 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 10, 20, 100 };
		m(a);

	}

	private static void m(int[] a) {
		Random random = new Random();
		int index = random.nextInt(a[a.length - 1] - a[0] - a.length + 1);
		int start = 0;
		int end = a.length - 1;
		int i = 0;
		int nill = 0;
		do {
			if (nill < index) {
				start = i;
			} else {
				end = i;
			}
			i = (end + start) / 2;
			nill = a[i] - a[0] - i;
		} while (end > (start + 1) && nill != index);
		System.out.print(a[i] + index - nill + 1);
	}

}
