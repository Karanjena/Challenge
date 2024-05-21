package Day2;

import java.util.*;

public class Strong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The NUmber");
		int n = sc.nextInt();
		int sum = 0;
		int copy = n;
		while (n > 0) {
			int d = n % 10;
			int fact = 1;
			for (int i = d; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == copy) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not strong NUmber");
		}

	}
}
