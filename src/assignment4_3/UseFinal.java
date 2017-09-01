package assignment4_3;

public final class UseFinal {    //final class definition
	
	final double  pi=3.14;        //final variable declared
	
	double rad;                  //one instance variable 
	
	UseFinal()                   //Default constructor
	{
		this.rad=-1;
		
	}
	
	UseFinal(double rad)           //one parameter constructor
	{
		this.rad=rad;
	}
	
	public final void area()        //final method 
	{
		double area=pi*rad*rad;
		System.out.println("The area calculated using final variable in the final declared method in final class is " +area);
	}
	
	public final void info()         //printing information of final keyword 
	{
		System.out.println(" ");
		System.out.println(" If variable is made final it becomes constant.");
		System.out.println(" If method is made final it cannot be overriden.");
		System.out.println(" If class is made final it cannot be inherited.");
		
	}
	
	
	public  static void main(String args[])    //main starts here 
	{
		
		UseFinal u1=new UseFinal(5.0);     //object with one parameter
 		
		u1.area();
		u1.info();
		
	}
	

}//class ends here
