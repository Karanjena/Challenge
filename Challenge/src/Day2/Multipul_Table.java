package Day2;
import java.util.*;
public class Multipul_Table {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	for(int i=1;i<=10;i++) {
		int mult=n*i;
		System.out.println(n+"*"+i+"="+mult);
	}
	
}
}
