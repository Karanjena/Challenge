package Day15;

import java.util.Scanner;

public class circumferenceOfAcircle {
	public static double circle(int radius) {
		double circumference=2*3.14*radius;
		return circumference;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		System.out.println(circle(radius));
		
	}
}
