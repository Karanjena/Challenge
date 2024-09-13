package Day13;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
			
		}
		int copy=num;
		while(num>0) {
			int d=num%10;
			int pow=1;
			
			for(int i=1;i<=count;i++) {
				pow=pow*i;
			}
			sum=sum+pow;
			num=num/10;
		}
		if(copy==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}

	}

}
