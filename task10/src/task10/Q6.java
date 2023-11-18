package task10;

public class Q6 {
	
	public class BlackTea extends overrides{
		public void prepareTea()
		{
			System.out.println("preparing black tea with hotwater and tea leaves");
		}
	}
public class GreenTea extends overrides{
	public void prepareTea()
	{
		System.out.println("preparing green tea with hotwater and green tea leaves");
	}
}
public class HearbalTea extends overrides{
	public void prepareTea()
	{
		System.out.println("preparing herbal tea with hotwater and herbal tea leaves");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Q6 t=new Q6();
    BlackTea bt =t .new BlackTea();
    bt.prepareTea();
   GreenTea gt =t .new GreenTea();
    gt.prepareTea();
   HearbalTea ht =t .new HearbalTea();
    ht.prepareTea();
	}

}
