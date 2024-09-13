package Day11;

public class MethodOverloading {

	public static void Sturent(int id) {
		System.out.println("M1");
	}
	public static void Student(double CGPA) {
		System.out.println("M2");
	}
	public static void Student(String name) {
		System.out.println("M3");
	}
	public static void main(String[] args) {
		Student("Karan");
		Student(9.5);
		Sturent(123);
	}
}
