package Day1;

import java.util.Scanner;

public class GretestCommonDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st Number");
		int n = sc.nextInt();
		System.out.println("Enter The 2nd Number");
		int n1 = sc.nextInt();
		int gds = 0;
		for (int i = 1; i <= n && i <= n1; i++) {
			if (n % i == 0 && n1 % i == 0) {
				gds = i;
			}
		}
		System.out.println(gds);

	}
}
