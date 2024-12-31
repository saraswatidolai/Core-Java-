package defaultConstructor;

public class Student {
	int id;
	String name;
	
	public void setStudentData() {
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);
	}
	
	public static void main(String[] args) {
		Student raj = new Student();
		raj.setStudentData();
	}
}
