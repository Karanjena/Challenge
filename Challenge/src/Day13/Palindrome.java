package Day13;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int sum=0;
		int copy=num;
		
		while(num!=0) {
			int r=num%10;
			sum=(sum*10)+r;
			num=num/10;	
		}
		if(sum==copy) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not Palindrome");
		}

		sc.close();
	}

}
