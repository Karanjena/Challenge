package Day7;

public class MethodOverloading {
	
	
	
	
	
	public static void add(int a) {
		System.out.println(a);
	
	}
	public static void add(double a) {
		System.out.println(a);
	}
	
	public static void add(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		MethodOverloading.add(12);
		MethodOverloading.add(23.09);
		MethodOverloading.add("Karan");


	}

}
