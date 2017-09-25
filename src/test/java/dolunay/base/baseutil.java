package dolunay.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class baseutil {

	protected WebDriver driver;
	
	public baseutil(WebDriver driver){
		this.driver = driver;
	}
	
	public void click(By by){
		
		driver.findElement(by).click();	
		
	}
	
	public void set(By by, String value){
		
		driver.findElement(by).sendKeys(value);
		
	}
}
