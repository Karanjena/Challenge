package Day10;

public class Polymorphism1 extends Polymorphism{
	@Override
	void login() {
		System.out.println("Login 1000 Lines");
	}

	public static void main(String[] args) {
		Polymorphism p=new Polymorphism1() ;
			p.login();
	}

}
