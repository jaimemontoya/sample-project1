package oops_concepts;

public class Methods {

	public static void main(String[] args) {
		Methods m = new Methods();
		m.doThis();
		m.addition(100, 200);
	}
	public void doThis() {
		System.out.println("Do This Executed");
	}
	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}