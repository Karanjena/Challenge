
// In a class two or more method and same method name but 
//Different FurmulaArgrument Is Called Method OverLoading


package Day12;

public class MethodOverloading {

	public static void student(int id) {
		System.out.println("Method 1");
	}
	public static void student(String name) {
		System.out.println("Method 2");
	}
	public static void student(double CGPA) {
		System.out.println("Method 3");
	}
	
	public static void main(String[] args) {
		student("Karan");
		student(143);
		student(89.00);
	}
}
