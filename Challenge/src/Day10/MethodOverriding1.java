package Day10;

public class MethodOverriding1 extends MethodOverriding{

	@Override
	void login() {
		System.out.println("Login 1000 Lines");
	}
	
	public static void main(String[] args) {
		MethodOverriding1 b=new MethodOverriding1();
		b.login();
	}
}
