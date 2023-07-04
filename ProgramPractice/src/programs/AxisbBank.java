package programs;

public class AxisbBank implements Bank {

	@Override
	public void depositAmount() {
		
		System.out.println("Depositing amount to Axis bank");
	}

	@Override
	public void fixedDeposit() {
		
		System.out.println("Withdrawing amount from Axis bank");
	}

	@Override
	public void RD() {
		
		System.out.println("Opening FD in Axis bank");
	}
	public void openFlexiDeposit() {
		
		System.out.println("OopenFlexiDeposit in Axis bank");
	}

}
