package Day2;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int reverse = 0;
		while (n != 0) {
			int d = n % 10;
			reverse = (reverse * 10) + d;
			n = n / 10;
		}
		System.out.println(reverse);
	}
}
