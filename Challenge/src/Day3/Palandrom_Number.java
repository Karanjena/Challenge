package Day3;
import java.util.*;
public class Palandrom_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int copy=n;
		while(n!=0) {
			int d=n%10;
			sum=(sum*10)+d;
			n=n/10;
		}
		if(sum==copy) {}
	}
}
