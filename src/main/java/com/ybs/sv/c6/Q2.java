package com.ybs.sv.c6;

import java.util.HashMap;
import java.util.Map;

public class Q2 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 1, 2, 5, 7 };
		System.out.println(m1(a, 7));
		System.out.println(m1(a, 8));
		System.out.println(m1(a, 11));

	}

	public static boolean m1(int[] a, int b) {
		Map<Integer, Integer> map = new HashMap<>(a.length >> 1);
		for (int i = 0; i < a.length; i++) {
			if (a[i] < (b >> 1)) {
				map.put(a[i], i);
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= b >> 1) {
				Integer index = map.get(b - a[i]);
				if (index != null) {
					System.out.println(index);
					System.out.println(i);

					return true;
				}
			}
		}
		return false;
	}

}
