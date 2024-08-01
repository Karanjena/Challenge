package Day7;

public class Construtor {
	int id;
	String Name;
	double sal;
	
	Construtor(int id,String Name,double sal){
		this.id=id;
		this.Name=Name;
		this.sal=sal;
	}
	void details() {
		System.out.println("Id :-"+id);
		System.out.println("Name :-"+Name);
		System.out.println("Sal :-"+sal);
		System.out.println("********************");
	}
public static void main(String[] args) {
	Construtor c=new Construtor(123, "Karan", 30000);
	Construtor c1=new Construtor(143, "Chiku", 31000);
	Construtor c2=new Construtor(134, "Sagar", 25000);
	Construtor c3=new Construtor(189, "Sambit", 20000);
	
	c.details();
	c1.details();
	c2.details();
	c3.details();
}
}
