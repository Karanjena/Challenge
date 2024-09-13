package Day12;

public class Polymorphism {

	void login() {
		System.out.println("Login Successfully");
	}
}

class instgram extends Polymorphism{
	@Override
	void login() {
		System.out.println(" Login of 1000 lines");
	}
	public static void main(String[] args) {
		Polymorphism p=new instgram();
		p.login();
	}
}
