/**
 * 
 */
package selenium.testng.day8;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Mukesh_50
 * 
 * This code will verify the content
 *
 */
public class VerificationTestNG 
{

	
	@Test
	public void verifyCount()
	{
		Assert.assertEquals(12, 12);
		
	}
	
	@Test
	public void verifyCountnew()
	{
		Assert.assertEquals(15, 12,"Dropdown values does not match as per requirement");
		
	}
	
	
	@Test
	public void verifyError()
	{
		
		Assert.assertEquals("Hello", "hello","Error does not match");
		
	}
	
	@Test
	public void verifyStatus()
	{
		
		Assert.assertEquals(true, false,"Status not verified");
		
	}
	
}
