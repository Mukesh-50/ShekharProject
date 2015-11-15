/**
 * 
 */
package selenium.testng.day8;

import org.testng.annotations.Test;

/**
 * @author Mukesh_50
 * 
 *  By deafult TestNG execute your test in alphabetical order
 *  
 */
public class SecondTestNGClass 
{

	@Test
	public void mytest()
	{
		System.out.println("This is my first testng test");
	}
	
	@Test
	public void Amytest1()
	{
		System.out.println("This is my Second testng test");
	}
	
	@Test
	public void zmytest2()
	{
		System.out.println("This is my third testng test");
	}
	
	@Test
	public void mytest3()
	{
		System.out.println("This is my fourth testng test");
	}
	
	
}
