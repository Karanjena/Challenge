package Day10;

public class Inharitance1 extends Inharitance{

	String sname="Karan";
	void hide() {
		System.out.println("Karan Hiding");
	}
	
	public static void main(String[] args) {
		Inharitance1 i=new Inharitance1();
		System.out.println(i.fname);
		i.run();
		System.out.println(i.sname);
		i.hide();
	}
}
