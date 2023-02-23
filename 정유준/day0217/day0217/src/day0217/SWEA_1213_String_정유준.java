package day0217;

import java.util.Scanner;

public class SWEA_1213_String_정유준 {

	static Scanner sc = new Scanner(System.in);
	static char[] t;
	static char[] p;
	static int count;
	static int word;

	static void input() {
		int testCase = sc.nextInt();
		String compare = sc.next();
		String original = sc.next();
		t = original.toCharArray();
		p = compare.toCharArray();
	}

	static int BruteForceWhilt(char[] p, char[] t) {
		int m = p.length;
		int n = t.length;
		count = 0;

		for (int i = 0; i < n - m + 1; i++) {
			word = 0;
			for (int j = 0; j < m; j++) {
				if (p[j] == t[i + j]) {
					word++;
				}
				if (word == m) {
					count++;
				}
			}
		}
		return count;
	}

	static void solve() {
		for (int tc = 1; tc <= 10; tc++) {
			input();
			BruteForceWhilt(p, t);
			System.out.println("#" + tc + " " + count);
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
