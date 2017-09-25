package dolunay.constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dolunay.base.baseutil;

public class loginConstant extends baseutil {

	public loginConstant(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By USERNAME = By.id("IntUserName");
	public By PASSWORD = By.id("Password");
	public By BTNSUBMIT = By.id("btnSubmit");

}
