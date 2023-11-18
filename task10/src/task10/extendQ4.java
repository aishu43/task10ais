package task10;

public class extendQ4 extends Q4{
	public extendQ4(String accountnumber,double balance)
	{
		super(accountnumber, balance);
	}
	public void withdraw(double amount) {
		if (getbalance()-amount <100)
		{
			System.out.println("minimum  balance required");
		}else
		{
			super.withdraw(amount);
		}
	}
}
