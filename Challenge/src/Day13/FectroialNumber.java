package Day13;

import java.util.Scanner;

public class FectroialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num =sc.nextInt();
		
		int fact=1;
		for(int i=num ; i>=1 ; i--) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
