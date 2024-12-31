package variableShadowing;

public class Student {
	int studentId = 111;
	String studentName ="Smith";
	
	public void accept() {
		int studentId = 222;
		String studentName = "John";
		
		System.out.println(studentId);
		System.out.println(studentName);
	}
	
}
