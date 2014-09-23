package com.ybs.sv.c9;

import java.util.HashSet;
import java.util.Set;

public class Q50 {

	public static void main(String[] args) {
		m("dfaffadfac");

	}

	private static void m(String s) {
		Set<Character> set = new HashSet<Character>();
		for (Character c : s.toCharArray()) {
			if (!set.add(c)) {
				System.out.println(c);
				return;
			}
		}
		System.out.println("no");
	}

}
