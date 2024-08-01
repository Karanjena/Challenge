package Day10;

public class Encapsulation {

	private int x=10;
	public int get() {
		return x;
	}
	public void set(int x) {
		this.x=x;
	}
	
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.set(20);
		System.out.println(e.get());
	}
}
