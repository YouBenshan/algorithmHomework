package com.ybs.sv.c13;

import java.util.HashMap;
import java.util.Map;

public class Q92 {
	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 9 };
		m(a);

	}

	private static void m(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			if (!map.containsKey(i)) {
				if (map.containsKey(i - 1) && map.containsKey(i + 1)) {
					int j = map.get(i - 1);
					int k = map.get(i + 1);
					map.put(i, 1);
					map.put(i - j, k + j + 1);
					map.put(i + k, k + j + 1);
				} else if (map.containsKey(i - 1)) {
					int j = map.get(i - 1);

					map.put(i - j, j + 1);
					map.put(i, j + 1);
				} else if (map.containsKey(i + 1)) {
					int k = map.get(i + 1);
					map.put(i, 1 + 1);
					map.put(i + k, k + 1);
				} else {
					map.put(i, 1);
				}
			}
		}
		int max = 0;
		for (int i : map.values()) {
			if (i > max) {
				max = i;
			}
		}

		System.out.println(max);

	}
}
