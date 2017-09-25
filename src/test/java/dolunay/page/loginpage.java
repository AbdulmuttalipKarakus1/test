package dolunay.page;

import org.openqa.selenium.WebDriver;

import dolunay.constant.loginConstant;

public class loginpage extends loginConstant {

	public loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public loginpage login(){
		
		set(USERNAME, "51771");
		set(PASSWORD, "12121212");
		click(BTNSUBMIT);
		return this;
		
	}
}
