package Day7;

public class ConstrutorOverLoading {

	int id;
	String name;
	double sal;
	ConstrutorOverLoading(int id){
		this.id=id;
	}
	ConstrutorOverLoading(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	ConstrutorOverLoading(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	void details() {
		System.out.println("Id:-"+id);
		System.out.println("Name:-"+name);
		System.out.println("Sal:-"+sal);
		System.out.println("**************");
	}
	public static void main(String[] args) {
		ConstrutorOverLoading c=new ConstrutorOverLoading(143);
		c.details();
		ConstrutorOverLoading c1=new ConstrutorOverLoading(123, "Karan", 30000);
		c1.details();
	}
}
