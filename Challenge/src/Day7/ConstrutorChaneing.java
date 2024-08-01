package Day7;

public class ConstrutorChaneing {

	ConstrutorChaneing(){
		this("Karan");
		System.out.println("M1");
	}
	ConstrutorChaneing(String name,int id){
		this(123);
		System.out.println("M2");
	}
	ConstrutorChaneing(String name){
		this("Karan",123);
		System.out.println("M3");
	}
	ConstrutorChaneing(int id){
		System.out.println("M4");
	}
	
	public static void main(String[] args) {
		ConstrutorChaneing c=new ConstrutorChaneing();
	}
}
