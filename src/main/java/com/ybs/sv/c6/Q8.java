package com.ybs.sv.c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		Interval[] intervals = { new Interval(1, 5), new Interval(6, 10),
				new Interval(4, 6), new Interval(15, 20), new Interval(19, 23) };
		List<Interval> list = m(intervals);

		for (Interval interval : list) {
			System.out.print(interval.start + "----" + interval.end + "    ");
		}

	}

	private static List<Interval> m(Interval[] intervals) {
		List<Interval> list = new ArrayList<>();
		Arrays.sort(intervals);

		Interval temp = intervals[0];
		for (int i = 1; i < intervals.length; i++) {
			if (temp.end >= intervals[i].start) {
				temp = new Interval(temp.start, intervals[i].end);
			} else {
				list.add(temp);
				temp = intervals[i];
			}
		}
		list.add(temp);
		return list;
	}

	public static class Interval implements Comparable<Interval> {
		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		int start;
		int end;

		@Override
		public int compareTo(Interval o) {
			return this.start - o.start;
		}
	}
}
