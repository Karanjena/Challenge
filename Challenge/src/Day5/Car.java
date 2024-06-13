package Day5;

public class Car extends Vehical{
	String Carname="BMW";
	double Carcost=7000000.00;
	
	void drive() {
		System.out.println("Driving ");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		System.out.println(c.Carname);
		System.out.println(c.Carcost);
		c.drive();
		c.stop();
	}
}
