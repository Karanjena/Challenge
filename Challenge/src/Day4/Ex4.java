package Day4;

public class Ex4 {

	public static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public int mult(int a,int b) {
		int c=a*b;
		return c;
	}
	public int div(int a,int b) {
		int c=a/b;
		return c;
		
	}
	public int mod(int a,int b) {
		int c=a%b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println(add(20, 30));
		System.out.println(sub(300, 100));
		Ex4 e=new Ex4();
		System.out.println(e.mult(20, 10));
		System.out.println(e.div(200, 100));
		System.out.println(e.mod(10, 20));
	}
}
