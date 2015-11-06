/**
 * 
 */
package javaBasic.Day1;

/**
 * @author Mukesh_50
 *
 *  Date- 11-Oct-2015
 */
public class Calculator {

	
	public static void main(String[] args) 
	{
		
		// First line will be entry point
		System.out.println("WElcome");
		

		int sum=Calculator.addNumber1();
		
		System.out.println("Sum is >>>>>>>>>"+sum);
		
		// Object creation
		// classname objectname= new classname();
		
		
		Calculator obj1=new Calculator();
		obj1.addNumber();
		
		
		
		
		
		

		System.out.println("Bye");
		// Last line of main will be exit point
	}
	
	
	// access-modifier static(optional) return-type method-name() {
    //    }

	
	// Add number with no return value
	public void addNumber()
	{
		
		int a=12;
		int b=89;
		
		int c=a+b;
		
		System.out.println("Value of Addition is"+c);
		
	}
	
	
	// Addd number with return sum
	public static int addNumber1()
	{
		
		int a=12;
		int b=89;
		
		int c=a+b;
	
		return c;
	}
	
	
	
}
