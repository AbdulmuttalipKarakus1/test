package dolunay.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dolunay.base.basetest;
import dolunay.page.loginpage;

public class loginTest extends basetest {
	
	@Test
	public void login(){
		new loginpage(driver).
		login();
		
	}

}
