package Day6;

public class ConstructorOverlopading {
	int age;
	int id;
	String name;
	
	ConstructorOverlopading(String name){
		this.name=name;
		
	}
	ConstructorOverlopading(int age,int id){
		this.age=age;
		this.id=id;
	}
	void details() {
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Id "+id);
	}

	public static void main(String[] args) {
		ConstructorOverlopading c=new ConstructorOverlopading("Karan");
		ConstructorOverlopading c1=new ConstructorOverlopading(23000, 234);
		c.details();
		
		
		

	}

}
