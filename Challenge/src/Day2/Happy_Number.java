package Day2;

import java.util.*;

public class Happy_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		while (true) {
			int sum = 0;

			while (n > 0) {
				int d = n % 10;
				sum = sum + (d * d);
				n = n / 10;
			}
			if (sum == 1) {
				System.out.println("Happy Number");
				break;
			} else if (sum == 4) {
				System.out.println("Unhappy Number");
				break;

			}
			n=sum;
		}
	}
}
