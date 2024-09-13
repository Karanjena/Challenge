//Constructor Is a Special Type Method it is 
//used to load and register non-static properties is call Constructor


package Day12;

public class Construstor {
	
    String name;
	int id;
	double sal;
	
	Construstor(String name,int id,int sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	void details() {
		System.out.println("Name :- "+name);
		System.out.println("Id :- "+id);
		System.out.println("sal :- "+sal);
	} 
	
	public static void main(String[] args) {
		Construstor c=new Construstor("Karan", 143, 87000);
		c.details();
		
	}
}
