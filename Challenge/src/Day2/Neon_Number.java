package Day2;

import java.util.*;

public class Neon_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int sum = 0;
		int sq = n * n;
		while (sq > 0) {
			int d = sq % 10;
			sum = sum + d;
			sq = sq / 10;
		}
		if (sum == 0) {
			System.out.println("Neon");
		} else {
			System.out.println("Not Neon");
		}
	}
}
