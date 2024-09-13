package Day1;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int sum=1;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		int copy=num;
		while(num>0) {
		int d=num%10;
		int pow=1;
		
		for(int i=1;i<d;i++) {
			pow=pow*i;
		}
		sum=sum+pow;
		num=num/10;
		
		}
		if(copy==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not ArmStrong Number");
		}
	}
}
