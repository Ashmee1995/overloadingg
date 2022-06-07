package overloading;

public class Calculation {

	void sum (int a, int b) {
		System.out.println(a + b);
	}
	void sum (int a, int b, int c) {
		System.out.println(a + b + c);
		
	}
	public static void main(String[] args) {
		Calculation Obj = new Calculation();
		Obj.sum(10, 10, 10);
		Obj.sum(20,20);
	}
}
