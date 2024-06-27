package Day6;

public class MethodOverloading {
	
	public static void student(String name) {
		System.out.println(name);
	}
	public static void student(int id) {
		System.out.println(id);
	}
	public static void student(double sal) {
		System.out.println(sal);
	}
	public static void student(long phoneNo) {
		System.out.println(phoneNo);
	}
	public static void main(String[] args) {
		MethodOverloading.student("Karan");
		System.out.println("KAran");
		student(9337671293l);
		student(35000.00);

	}

}
