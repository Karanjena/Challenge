//in a class teo or more constructor 
//and same constructor name but different farmulaArguments 
//is called Constructor Overloading

package Day12;

public class Constructor_Overloading {
	int id;
	String name;
	double sal;

	Constructor_Overloading(int id){
		this.id=id;
		
	}
	Constructor_Overloading(int id,double sal){
		this.id=id;
		this.sal=sal;
	}
	Constructor_Overloading(String name,int id,double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	void details() {
		System.out.println("Name :- "+name);
		System.out.println("Id :- "+id);
		System.out.println("Sal :- "+sal);
	}
	public static void main(String[] args) {
		Constructor_Overloading c=new Constructor_Overloading("Karan",123,292.00);
		c.details();
		Constructor_Overloading c1=new Constructor_Overloading(123,292.00);
		c1.details();
	}
}
