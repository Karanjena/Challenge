package Day14;

public class MethodOverloading {
	
	public static void add(int id) {
		System.out.println(id);
	}
	
	public static void add(String name) {
		System.out.println(name);
	}
	
	public static void add(double sal) {
		System.out.println(sal);
	}

	public static void main(String[] args) {
		MethodOverloading.add("Karan");
		MethodOverloading.add(12);
		MethodOverloading.add(12.34);
	}

}
