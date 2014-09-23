package com.ybs.sv.c6;

import java.util.HashMap;
import java.util.Map;

public class Q3 {

	private static final Map<Integer, Boolean> map = new HashMap<>();

	public static void main(String[] args) {
		save(1);
		save(3);
		save(4);
		save(6);
		save(2);
		save(3);
		save(6);

		System.out.println(test(4));
		System.out.println(test(9));
		System.out.println(test(12));
		System.out.println(test(8));
		System.out.println(test(2));
	}

	public static void save(int input) {
		if (map.containsKey(input)) {
			map.put(input, true);
		} else {
			map.put(input, false);
		}
	}

	public static boolean test(int b) {
		for (int i : map.keySet()) {
			if (i >= b >> 1 && map.containsKey(b - i)) {
				if (b == i << 1) {
					if (map.get(i)) {
						return true;
					}
				} else {
					return true;
				}

			}
		}
		return false;
	}
}
