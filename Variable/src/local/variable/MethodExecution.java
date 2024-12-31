package local.variable;

public class MethodExecution {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		m1();
		System.out.println("Main Method Ended");
	}
	public static void m1() {
		System.out.println("m1 Method started");
		m2();
		System.out.println("m1 Method ended");
	}
	public static void m2() {
		int x = 100;
		System.out.println("M2 method body: "+x);
	}
}
