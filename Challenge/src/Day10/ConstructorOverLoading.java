package Day10;

public class ConstructorOverLoading {
	String name;
	int age;
	double sal;
	
	ConstructorOverLoading (String name){
		this.name=name;
	}
	ConstructorOverLoading(String name,int age){
		this.name=name;
		this.age=age;
	}
	ConstructorOverLoading(String name,int age,double sal){
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	void details() {
		System.out.println("Name:- "+name);
		System.out.println("Age:- "+age);
		System.out.println("Sal:- "+sal);
	}
	

	public static void main(String[] args) {
		ConstructorOverLoading c=new ConstructorOverLoading("Karan");
		c.details();

	}

}
