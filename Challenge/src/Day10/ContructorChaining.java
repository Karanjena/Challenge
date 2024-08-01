package Day10;

public class ContructorChaining {

	ContructorChaining(){
		this(10,20.30);
		System.out.println("C-1");
	}
	
	ContructorChaining(String a,int b){
		this(23.00,123);
		System.out.println("C-2");
	}
	ContructorChaining(double a,int b){
		this(123,"Karan");
		System.out.println("C-3");
	}
	
	ContructorChaining(int a,double b){
		this("Karan",12);
		System.out.println("C-4");
	}
	ContructorChaining(int a,String b){
		System.out.println("C-5");
	}
	
	public static void main(String[] args) {
		ContructorChaining c=new ContructorChaining();
	}
}
