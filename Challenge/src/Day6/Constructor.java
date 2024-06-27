package Day6;

public class Constructor {
	
	int age;
	String name;
	
	Constructor(int age,String name){
		this.age=age;
		this.name=name;
	}
	void details() {
		System.out.println("Name"+name);
		System.out.println("Age"+age);
	}

	public static void main(String[] args) {
		Constructor c=new Constructor(24, "Karan");
		c.details();

	}

}
