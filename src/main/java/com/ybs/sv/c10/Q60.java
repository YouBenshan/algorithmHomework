package com.ybs.sv.c10;

public class Q60 {
	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 9 };
		m(a);

	}

	private static void m(int[] a) {
		int i = 0;
		int j = 1;
		while (j < a.length) {
			while (a[i] == a[j]) {
				j++;
				if (j == a.length) {
					break;
				}
			}
			if (j == a.length) {
				break;
			}

			i++;
			a[i] = a[j];
			j++;
		}
		for (int k = 0; k <= i; k++) {
			System.out.print(a[k]);
		}
	}
}
