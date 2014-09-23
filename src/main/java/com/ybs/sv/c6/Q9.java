package com.ybs.sv.c6;

public class Q9 {
	public static void main(String[] args) {
		int[] a = { 12, 22, 32, 12, 12, 34, 55, 43, 23, 55 };
		int k = 7;
		System.out.print(m(a, k));
	}

	private static boolean m(int[] a, int k) {
		int[] y = new int[k - 1];
		for (int i : a) {
			int j = i % k;
			if (j != 0) {
				y[j - 1] = y[j - 1] + 1;
			}
		}

		int j = (k - 1) >> 1;
		for (int i = 0; i < j; i++) {
			if (y[i] != y[k - 2 - i]) {
				return false;
			}
		}

		if (k % 2 == 0) {
			if (y[k >> 1] % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}
