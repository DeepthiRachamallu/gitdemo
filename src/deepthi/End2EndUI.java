package deepthi;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class End2EndUI {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Auto drop down INDIA
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("INDIa")) {
				option.click();
				break;
			}
		}
		
	/*	//Auto drop down  with key board actions
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Robot r=new Robot();
		for(int i=1;i<=2;i++) {
		r.keyPress(KeyEvent.VK_DOWN);}
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);	
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		*/
		
		//From delhi
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		
		//To chennai
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println("To success full");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		//click on one way and verify return date disable
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		
	
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {
			Assert.assertTrue(true);
			System.out.println("Return date disabled");
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		//currencey drop down
		Select dp=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		
		dp.selectByValue("INR");
		
		
		//check boxes
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		
		
		
		//passenger dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}
	

}
