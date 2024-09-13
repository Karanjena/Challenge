//the process of chaning one constructor from onther conctructor
//is called Constructor

package Day12;

public class Constructor_Chaining {
	
	Constructor_Chaining(){
		this("Karan",234);
		System.out.println("M1");
	}
	Constructor_Chaining(int a,double b){
		this("Karan",143,234.00 );
		System.out.println("M2");
	}
	Constructor_Chaining(String a,int b){
		this(234,345.00);
		System.out.println("M3");
	}
	Constructor_Chaining(String a,int b,double c){
		this("Rahul");
		System.out.println("M4");
	}
	Constructor_Chaining(String a){
		System.out.println("M5");
	}
	

	public static void main(String[] args) {
		Constructor_Chaining c=new Constructor_Chaining();
	}
}
