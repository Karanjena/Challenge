package Day4;

public class Ex3 {

	String color="Black";
	String Brand="Bajaj";
	double cost=10000.00;
	
	public  void Fetures() {
		System.out.println("There are All button Touch Screen");
	}
	public  void Run() {
		System.out.println("On The switch And Autometic run");
	}
	public  void stop() {
		System.out.println("Turn Off Switch");
	}
	public static void main(String[] args) {
		Ex3 e=new Ex3();
		System.out.println(e.color);
		System.out.println(e.Brand);
		System.out.println(e.cost);
		e.Fetures();
		e.Run();
		e.stop();
		
	}
}
