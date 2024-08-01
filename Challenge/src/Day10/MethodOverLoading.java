package Day10;

public class MethodOverLoading {
	
	void student(int id) {
		System.out.println("Id:- "+id);
	}
	void student(String name) {
		System.out.println("Name:- "+name);
	}
	void student(double sal) {
		System.out.println("Sal:- "+sal);
	}

	public static void main(String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		m.student("Karan");
		m.student(143);
		m.student(55000.00);

	}

}
