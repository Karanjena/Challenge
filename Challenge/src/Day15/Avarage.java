package Day15;

import java.util.Scanner;

public class Avarage {
	
	public static void average(int a,int b, int c) {
		int sum=a+b+c;
		System.out.println(sum/3);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		average(a, b, c);
		
	}
}