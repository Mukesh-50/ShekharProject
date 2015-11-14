package selenium.day7;


/*
 *   Handle untrusted certificate in Firefox
 *   
 */

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class UntrsutedCertificateDemoFirefox {

	public static void main(String[] args) 
	{
	
		
		FirefoxProfile profile=new FirefoxProfile();
		
		profile.setAssumeUntrustedCertificateIssuer(true);
		
		profile.setAcceptUntrustedCertificates(true);
		
		FirefoxDriver driver=new FirefoxDriver(profile);

	}

}
