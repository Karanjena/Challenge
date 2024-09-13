package Day13;

import java.util.Scanner;

public class FibonaceiNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2=sc.nextInt();
		
		int c=0;
		int d=1;
		int e=0;
		
		for(int i=num1;i<=num2;i++) {
			System.out.println(c);
			e=c+d;
			c=d;
			d=e;
		}
	   sc.close();
	}
}
