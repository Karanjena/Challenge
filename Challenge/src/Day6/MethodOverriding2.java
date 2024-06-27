package Day6;

public class MethodOverriding2 extends MethodOverriding{
	
	int age=24;
	void add() {
		System.out.println("Byy");
	}

	public static void main(String[] args) {
		MethodOverriding2 x=new MethodOverriding2();
		x.add();
		System.out.println(x.age);

	}

}
