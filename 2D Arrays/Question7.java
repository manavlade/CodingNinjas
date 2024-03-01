import java.util.ArrayList;

public class Question7 {
	/*
	 * Question
	 * You have been given a matrix of ‘N’ rows and ‘M’ columns filled up with
	 * integers where every row is sorted in non-decreasing order. Your task is to
	 * find the overall median of the matrix i.e if all elements of the matrix are
	 * written in a single line, then you need to return the median of that linear
	 * array.
	 * 
	 * The median of a finite list of numbers is the "middle" number when those
	 * numbers are listed in order from smallest to greatest. If there is an odd
	 * number of observations, the middle one is picked. For example, consider the
	 * list of numbers [1, 3, 3, 6, 7, 8, 9]. This list contains seven numbers. The
	 * median is the fourth of them, which is 6.
	 */
	public static int countSmallerEqualToMid(ArrayList<Integer> arr, int mid) {
		int l = 0;
		int h = arr.size() - 1;

		while (l <= h) {
			int md = l + (h - l) / 2;
			if (arr.get(md) <= mid) {
				l = md + 1;
			} else {
				h = md - 1;
			}
		}

		return l;
	}

    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
		int low = 1;
		int high = 100000;
		int n = matrix.size();
		int m = matrix.get(0).size();

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int cnt = 0;

			for (int i = 0; i < n; i++) {
				cnt += countSmallerEqualToMid(matrix.get(i), mid);
			}

			if (cnt <= (n * m) / 2) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;
	}

}
