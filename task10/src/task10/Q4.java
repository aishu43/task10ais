package task10;

public class Q4 {
	
	public String accountnumber;
	public double balance;
	
	public Q4(String accountnumber, double balance) {
	this.accountnumber = accountnumber;
	this.balance =balance;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		if(balance >=amount)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	public double getbalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("create a bank account");
      Q4 BA1234= new Q4("BA001",1000);
      System.out.println("deposite amount");
      
      BA1234.deposit(1000);
      System.out.println("new balance "+ BA1234.getbalance() );
      System.out.println("deposite amount");
      
      BA1234.deposit(500);
      System.out.println("new balance" + BA1234.getbalance());
      System.out.println("create a savings account:");
      
      extendQ4 SA1000=new extendQ4("SA1000",300);
      System.out.println("try to withdraw");
      SA1000.withdraw(250);
      System.out.println("balance after withdraw" + SA1000.getbalance());
	}

}
