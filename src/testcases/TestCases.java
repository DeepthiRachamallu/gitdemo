package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.ReddiffHomePage;
import objectrepository.RediffLoginPage;


public class TestCases {
	
	
	@Test
	public void rediff()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		ReddiffHomePage rh=new ReddiffHomePage(driver);
		
		
		RediffLoginPage rl=new RediffLoginPage(driver);
		rl.uname().sendKeys("DeepthiReddy");
		rl.pass().sendKeys("CIUYTD");
		rl.login().click();
		
		
		
		
		
	}

	
	

}
