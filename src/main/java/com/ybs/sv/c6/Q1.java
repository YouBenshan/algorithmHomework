package com.ybs.sv.c6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q1 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 1, 2, 5, 7 };
		System.out.print(m1(a, 7));
		System.out.print(m1(a, 8));
		System.out.print(m1(a, 11));

	}

	public static boolean m1(int[] a, int b) {
		Set<Integer> set = new HashSet<>(a.length >> 1);
		for (int i = 0; i < a.length; i++) {
			if (a[i] < b >> 1) {
				set.add(a[i]);
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= b >> 1 && set.contains(b - a[i])) {
				return true;
			}
		}
		return false;
	}

	public static boolean m2(int[] a, int b) {
		Arrays.sort(a);
		int i = 0, j = a.length - 1;
		while (i < j) {
			int mount = a[i] + a[j];
			if (mount == b) {
				return true;
			} else if ((a[i] + a[j]) > b) {
				j--;

			} else {
				i++;
				continue;
			}
		}
		return false;
	}

}
