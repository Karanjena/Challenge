package Day10;

public class TypeCasting1 extends TypeCasting{

	int b=20;
	
	void sub() {
		System.out.println("M2");
	}
	
	public static void main(String[] args) {
		TypeCasting t=new TypeCasting1();  //UpCasting
	    System.out.println(t.a);
	    t.add();
	    
	    System.out.println("*********");
	    
	    TypeCasting1 z=(TypeCasting1)t;   //DownCasting
	    System.out.println(z.a);
	    z.add();
	    System.out.println(z.b);
	    z.sub();
	}
}
