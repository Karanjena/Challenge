package Day15;

import java.util.Scanner;

public class Nth_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int number=sc.nextInt();
		System.out.println("Enter The Nth Number");
		int n=sc.nextInt();
		
		int result=1;
		
		for(int i=1;i<=n;i++) {
			result=result*number;
		}
		System.out.println(result);
	}
}
