package com.ybs.sv.c17;

public class Q132 {

	public static void main(String[] args) {

		System.out.println(m(4));
		System.out.println(m(5));
		System.out.println(m(0));

	}

	private static boolean m(int k) {
		if (k == 0) {
			return false;
		} else {
			return ((k & (k - 1)) == 0);
		}
	}
}
