package Day11;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		System.out.println("Chose your Requrement");
		System.out.println("1 for +");
		System.out.println("2 for -");
		System.out.println("3 for *");
		System.out.println("4 for /");
		System.out.println("5 for %");
		
		int sitch=sc.nextInt();
		
		switch (sitch) {
		case 1: System.out.println(a+b);
		break;
		case 2: System.out.println(a-b);
		break;
		case 3: System.out.println(a*b);
		break;
		case 4: if(b==0) {
			System.out.println("Invalid");
		}else {
			System.out.println(a/b);
		}
		break;
		case 5: if(b==0) {
			System.out.println("Invalid");
		}else {
			System.out.println(a%b);
		}
		default:
			System.out.println("Please Enter Valid Input");
		}
	}

}
