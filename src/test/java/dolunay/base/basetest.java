package dolunay.base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basetest {
	
	protected WebDriver driver;
	
	@Before
	public void OpenPage(){
		
		
		 System.setProperty("webdriver.gecko.driver","D:\\Users\\akarakus\\Desktop\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			
		driver = new FirefoxDriver();
		 driver.get("http://internetbranchprep/Login/InitialLogin");
	}

}
