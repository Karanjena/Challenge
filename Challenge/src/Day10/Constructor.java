package Day10;

public class Constructor {

	int id;
	double sal;
	String name;
	
	Constructor(String name,int id,double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;	
	}
	
	void details() {
		System.out.println("Name:- "+name);
		System.out.println("Id:- "+id);
		System.out.println("Sal:- "+sal);
		System.out.println("******************");
	}
	
	public static void main(String[] args) {
		Constructor c=new Constructor("Karan", 143, 23000);
		Constructor c1=new Constructor("Rahul", 134, 23000);
		Constructor c2=new Constructor("ItiShree", 135, 34000);
		c.details();
		c1.details();
		c2.details();
		
	}
	
}
