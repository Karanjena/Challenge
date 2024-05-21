package Day2;

import java.util.*;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int sum = 0;
		int copy = n;
		while (n != 0) {
			int d = n % 10;
			sum = (sum * 10) + d;
			n = n / 10;
		}
		if (sum == copy) {
			System.out.println("It Is Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}
	}
}
