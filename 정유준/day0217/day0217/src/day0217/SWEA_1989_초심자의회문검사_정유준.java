package day0217;

import java.util.Scanner;

public class SWEA_1989_초심자의회문검사_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			int count = 0;
			String isSame = sc.next();
			char[] compare = isSame.toCharArray();
			int length = (isSame.length()) / 2;
			for (int i = 0; i < length; i++) {
				if (compare[i] == compare[compare.length - i - 1]) {
					count++;
				} else {
					break;
				}
			}
			if (count == length) {
				System.out.println("#" + idx + " " + "1");
			} else {
				System.out.println("#" + idx + " " + "0");
			}
		}
	}
}
