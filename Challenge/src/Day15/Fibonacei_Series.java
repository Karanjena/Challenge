package Day15;

import java.util.Scanner;

public class Fibonacei_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		
		int c=0;
		int d=1;
		int e=0;
		
		for(int i=a;i<=b;i++) {
			System.out.println(c);
			e=c+d;
			c=d;
			d=e;
			
		}
	}
}
