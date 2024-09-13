package Day13;

import java.util.Scanner;

public class RangeBetweenMultipleTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2 = sc.nextInt();

		int count = 0;
		for (int i = num; i <= num2; i++) {
			int mal = i;
			for (int j = 1; j <= 10; j++) {
				int multi = mal * j;
				System.out.println(mal + "*" + j + "=" + multi);
			}
		}

	}

}
