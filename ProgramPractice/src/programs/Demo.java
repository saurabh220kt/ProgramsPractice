package programs;

public class Demo {

	public static void main(String[] args) {	
		Car a = new Car();
		a.carCost = 4500000;
		a.carmodel = "BMW";
		a.startCar();
		a.stopCar();

	BMW d = new BMW();
	d.startCar();
	
	AxisbBank test = new AxisbBank();
	test.depositAmount();
	test.fixedDeposit();
	test.RD();
	test.openFlexiDeposit();
	
	}
}
