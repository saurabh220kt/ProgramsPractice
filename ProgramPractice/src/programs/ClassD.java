package programs;

public class ClassD extends ClassC {

	int a=9;
	
	public void methodX() {
		System.out.println("Inside methodX of Child");
	}
	
	public void methodY() {
		
		System.out.println(super.a);
	}
}
