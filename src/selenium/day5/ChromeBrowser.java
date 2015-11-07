package selenium.day5;

/*
 * 
 *  IllegalStateException- When we work with any browser apart from Firefox then we have to provide the driver path
 * 
 */


import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) 
	{
        
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh_50\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.learn-automation.com");

	}

}
