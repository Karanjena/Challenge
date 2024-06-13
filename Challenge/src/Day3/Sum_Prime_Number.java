package Day3;

import java.util.*;

public class Sum_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter The 2nd Number");
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			int n = i;
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum = sum + n;
			}
		}
		System.out.println(sum);
	}

}
