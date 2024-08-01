package Day7;

public class MethodOverriding2 extends MethodOverriding{

	@Override
	public void add() {
		System.out.println("Byy");
	}
	
	public static void main(String[] args) {
		MethodOverriding2 m=new MethodOverriding2();
		m.add();
	}
	
}
