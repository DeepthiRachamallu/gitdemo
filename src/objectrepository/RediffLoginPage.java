package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("login");
	
	public WebElement uname()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement pass()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
		
	}
	
	
	
}
