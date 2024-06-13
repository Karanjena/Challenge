package Day5;

public class Bike extends Vehical {

	String Bikename="Rx100";
	double Bikecost=70000.00;
	
	void ride() {
		System.out.println("Riding ");
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.start();
		System.out.println(b.Bikename);
		System.out.println(b.Bikecost);
		b.ride();
		b.stop();
	}
}
