package Day6;

public class ConstructorChainCalling {
	
	ConstructorChainCalling(int age){
		this("Karan",78);
		System.out.println("m1");
	}
	ConstructorChainCalling(String name){
		this(23.00);
		System.out.println("m2");
	}
	ConstructorChainCalling(double sal){
		this(345);
		System.out.println("m3");
	}
	ConstructorChainCalling(String name,int age){
		System.out.println("m4");
	}
	public static void main(String[] args) {
		ConstructorChainCalling c=new ConstructorChainCalling("dgddfg");



	}

}
