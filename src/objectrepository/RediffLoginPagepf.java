package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagepf {
	WebDriver driver;
	public RediffLoginPagepf(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login")
	WebElement login;
	
	
	
	
	public WebElement uname()
	{
		return username;
	}
	public WebElement pass()
	{
		return password;
		
	}
	public WebElement login()
	{
		return login;
	}
	
}
