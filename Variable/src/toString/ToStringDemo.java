package toString;

public class ToStringDemo {

	public static void main(String[] args) {
		Trainer scott = new Trainer();
		scott.setTrainerData(111, "scott", "Java");
		System.out.println(scott);
	}
}
