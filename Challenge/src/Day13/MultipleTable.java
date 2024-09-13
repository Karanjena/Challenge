package Day13;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num=sc.nextInt();
//		System.out.println("Enter 2nd Number");
//		int num2=sc.nextInt();
		
		for(int i=num;i<=10;i++) {
			int mult=num*i;
		System.out.println(num+"*"+i+"="+mult);
		}

	}

}
