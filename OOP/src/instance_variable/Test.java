package instance_variable;

public class Test {

	int x = 100;
	public static void main(String[] args) {
		//System.out.println(x);   //Error:Object is not created
		Test t = new Test();
		System.out.println(t.x);
	}
}
