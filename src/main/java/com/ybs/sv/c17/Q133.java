package com.ybs.sv.c17;

public class Q133 {
	public static void main(String[] args) {

		System.out.println(m(4));
		System.out.println(m(16));
		System.out.println(m(0));
		System.out.println(m(8));

	}

	private static boolean m(int k) {
		if (k == 0) {
			return false;
		} else {
			return ((k & (k - 1)) == 0)&&((k & 0xAAAAAAAA)==0);
		}
	}
}
