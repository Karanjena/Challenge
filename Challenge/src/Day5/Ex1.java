package Day5;

import Day4.Ex2;

public class Ex1 {
	
	String name;
	int id;
	String pass;
	
	Ex1(String name,int id,String pass){
		this.name=name;
		this.id=id;
		this.pass=pass;
	}
	
	void details() {
		System.out.println("Instgram name is "+name);
		System.out.println("Instgram id is "+id);
		System.out.println("Instgram password id   "+pass);
	}

	public static void main(String[] args) {
		Ex1 e=new Ex1("Karan",123,"Karan@123");
		Ex1 e1=new Ex1("Rahul", 1234, "Rahul@123");
		e.details();
		e1.details();
		

	}

}
