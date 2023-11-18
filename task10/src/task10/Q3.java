package task10;

public class Q3 {
	
	public double radius;
	
	public Q3(double radius)
	{
	this.radius =radius;
}
	public double getRadius() {
		return radius;
		
	}
	
	public void setRadius(double radius)
	{
		this.radius =radius;
	}
	
	public double getarea()
	{
		return 	Math.PI * radius *radius;
	}
		public double getCircumference()
		{
			return 2 * Math.PI*radius;
		}
	
	public static void main (String [] args) 
	{
		// TODO Auto-generated method stub
      int r= 5;
     Q3 circle =new Q3(r);
      System.out.println("radius of the circle is : " + r);
      System.out.println ("area of the circle is : " + circle.getarea());
      System.out.println("circumference of the circle : " + circle.getCircumference());
	r=8;
	circle.setRadius(r);
	System.out.println("radius of the circle is :" + r);
    System.out.println ("area of the circle is : " + circle.getarea());
    System.out.println("circumference of the circle : " + circle.getCircumference());
	}
	

}
