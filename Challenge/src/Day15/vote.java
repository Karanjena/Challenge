package Day15;

import java.util.Scanner;

public class vote {
	
	public static boolean eligible(int age) {
		if(age>18) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println(eligible(age));
		
	}
}
