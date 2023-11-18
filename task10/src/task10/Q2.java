package task10;

public class Q2 {

	
	 public int ID;
	 public String name;
     public double salary;
     
     public Q2 (int ID,String name,double salary)
     {
    	 this.ID=ID;
    	 this.name=name;
    	 this.salary=salary;
     }
     
     public int getID()
     {
    	 return ID;
     }
     public void setID(int ID)
     {
    	this.ID=ID;
     }
     
    public String getname()
    {
    	return name;
    }
    
    public void setname(String name)
    {
    	this.name =name;
    }
    public double getsalary()
    {
    	return salary;
    }
    
    public void setsalary(double salary)
    {
    	this.salary =salary;
    }
    
    public void raisesalary (double percentage)
    {
    	salary = salary + salary * percentage/100;
    	
    }
    public void printQ1()
    {
    	System.out.println("ID:" + ID);
    	System.out.println("name:" +name);
    	System.out.println("salary" + salary);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    Q2 empl1=new Q2 (123,"aishu",2000.05);
    Q2 empl2= new Q2 (456,"maya",2000.13);
    
    empl1.raisesalary(9);
    empl2.raisesalary(10);
    
    System.out.println("\n after raising salary:");
    System.out.println("\n9% for 'aishu':");
    empl1.printQ1();
    System.out.println("\n10% for 'maya':");
    empl2.printQ1();
	}

}
