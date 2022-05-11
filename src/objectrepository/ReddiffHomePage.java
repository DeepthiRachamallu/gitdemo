package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddiffHomePage {
	
	WebDriver driver;
	 public ReddiffHomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By search=By.id("srchword");
	By submit=By.name("srchword");
	syso"github"
	
	
	
	public WebElement search()
	{
	return driver.findElement(search);	
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}
