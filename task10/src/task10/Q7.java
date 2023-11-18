package task10;

public class Q7 
{
	public String name;
	
	public Q7(String name)
	{
		this.name=name;
		}
public void done()
{
	System.out.println(name+ "tea is done");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Q7[]teaArray =new Q7[3];
         
          teaArray[0] = new
       Q7("Regular");
          teaArray[1] =new
       GreenTea("medium");
          teaArray[2] = new
       BlackTea("Strong");
        		  
          for(Q7 tea:teaArray)
          {
        	  tea.done();
          }
	}

}
