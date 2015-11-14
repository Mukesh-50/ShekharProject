package selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWorkSwitchFrames {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/iframe-practice-page/");
		
		// Page content
		
		String pContent1=driver.findElementByXPath("//div[@id='content']/h1").getText();
		System.out.println("Text From Main Page: "+ pContent1);
		
		driver.switchTo().frame("IF1");
		String frame1text=driver.findElementByXPath("//*[@id='content']/h1").getText();
		System.out.println("Text From Frame1= "+ frame1text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("IF2");
		String frame2text=driver.findElementByXPath(".//*[@id='post-9']/div/div[3]/h5").getText();
		System.out.println("Text From Frame2= "+ frame2text);
		
		driver.switchTo().defaultContent();
		String pContent2=driver.findElementByXPath("//*[@id='content']/h2").getText();
		System.out.println("Text From Main Page: "+pContent2);

	}

}
