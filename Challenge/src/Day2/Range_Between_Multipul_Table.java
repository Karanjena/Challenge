package Day2;

import java.util.*;

public class Range_Between_Multipul_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			int n = i;
			for (int j = 1; j <= 10; j++) {
				int mult = n * j;
				System.out.println(n + "*" + j + "=" + mult);
			}
		}

	}
}
