package Day14;

public class constructor {
	int id;
	String name;
	double sal;
	

	public constructor(String name,int id,double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	void details() {
		System.out.println("Name :-"+name);
		System.out.println("Sal :-"+sal);
		System.out.println("Id :-"+id);
	}
	
	public static void main(String[] args) {
		constructor c=new constructor("Karan", 15, 78.88);
		c.details();
		constructor c1=new constructor("Rahul", 100, 90.00);
		c1.details();
	}
}
