package Day6;

public class Typecasting2 extends Typecasting {

	int b=24;
	void sub() {
		System.out.println("m-2");
	}
	public static void main(String[] args) {
		Typecasting t=new Typecasting2();//upcasying
		t.add();
		System.out.println(t.age);
		
		Typecasting2 t1=(Typecasting2)t;//downcasting
		t1.sub();
		System.out.println(t1.age);
		System.out.println(t1.b);
		t1.add();
		
	}
}
