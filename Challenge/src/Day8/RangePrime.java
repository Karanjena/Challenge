package Day8;

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");

		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++) {
			int n=i;
			int count=0;
			for(int j=1;j<=n;j++) {
				if(i%j==0) {
				count++;
				}
			}
			if (count==2) {
				System.out.println(n);
			} 
			
		}
	}

}
