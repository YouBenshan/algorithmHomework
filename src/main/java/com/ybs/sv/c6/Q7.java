package com.ybs.sv.c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {

	public static void main(String[] args) {
		Interval[] intervals = { new Interval(3, 4), new Interval(7, 10) };
		Interval newInterval = new Interval(11, 12);
		List<Interval> list = m(intervals, newInterval);

		for (Interval interval : list) {
			System.out.print(interval.start + "----" + interval.end + "    ");
		}

	}

	private static List<Interval> m(Interval[] intervals, Interval newInterval) {
		List<Interval> list = new ArrayList<>();
		int i = 0;

		if (newInterval.end < intervals[0].start) {
			list.add(newInterval);
		} else if (newInterval.start > intervals[intervals.length - 1].end) {
			list.addAll(Arrays.asList(intervals));
			list.add(newInterval);
		} else {
			while (i < intervals.length && newInterval.start > intervals[i].end) {
				list.add(intervals[i]);
				i++;
			}

			if (newInterval.end < intervals[i].start) {
				list.add(newInterval);
			} else {
				int s = Math.min(intervals[i].start, newInterval.start);

				while (i < intervals.length
						&& newInterval.end >= intervals[i].start) {
					i++;
				}
				i--;
				int e = Math.max(intervals[i].end, newInterval.end);
				list.add(new Interval(s, e));
				i++;
			}

			for (; i < intervals.length; i++) {
				list.add(intervals[i]);
			}
		}

		return list;

	}

	public static class Interval {
		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		int start;
		int end;
	}
}
