//the process of inhetic properties form one clas into anathore class 
//is call inheritance 

package Day12;

public class Inheritance {

	String fname="Father";
	void bike() {
		System.out.println("Fathers Bike");
	} 	
}

class B extends Inheritance{
	 String sname="Sun";
	 
	 void Cycle() {
		 System.out.println("Suns Cycel");
	 }	 
	 public static void main(String[] args) {
		B b=new B();
		System.out.println(b.fname);
		b.bike();
		System.out.println(b.sname);
		b.Cycle();
	}
}
