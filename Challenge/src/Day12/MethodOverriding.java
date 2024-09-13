
//it is the process of inheritic properties from sub class into Super class
//keep same method declaration but clange implemantion is called method Overriding
package Day12;

public class MethodOverriding {
	String fname="Dillip";
	void car() {
		System.out.println(fname+"Ride car");
	}

}

class C extends MethodOverriding{
	String sname="Karan";
	@Override
	void car() {
		System.out.println(sname+"Ride");
	}
	public static void main(String[] args) {
		C b=new C();
		b.car();
	}
}
