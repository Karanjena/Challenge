package Day12;

public class Non_primitive1 extends Non_primitive{

		int b = 29;

		void sub() {
			System.out.println("M2");
		}

		public static void main(String[] args) {
			Non_primitive n = new Non_primitive1(); // Upcasting
			System.out.println(n.a);
			n.add();
			Non_primitive1 k = (Non_primitive1) n;              // DownCasting
			System.out.println(k.a);
			k.add();
			System.out.println(k.b);
			k.sub();

		

	}

}
