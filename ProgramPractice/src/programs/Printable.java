package programs;

public interface Printable {
	
	void print();
}
class test implements Printable{

	@Override
	public void print() {
		System.out.println("It is printing");
}
	public static void main(String[] args) {
		{
			test t = new test();
			t.print();
		}
	}
	
}
