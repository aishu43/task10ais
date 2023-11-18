package task10;

public class Q1 {
    public String name;
    public int age;
    public Q1 (String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Q1 person1= new Q1 ("kzora" ,2);
    Q1 person2= new Q1 ("maya",2);
    System.out.println(person1.getname() + person1.age);
    System.out.println(person2.getname() + person2.age);
	}

}
