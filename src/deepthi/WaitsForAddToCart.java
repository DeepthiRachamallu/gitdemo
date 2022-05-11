package deepthi;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsForAddToCart {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	//ExplicitWait
	WebDriverWait w=new WebDriverWait(driver,5);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	String[] itemsNeeded= {"Brocolli","Cucumber","Carrot"}; 	
	addItems(driver,itemsNeeded);	
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
	driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
	System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	driver.close();
	

	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
	String[] productName=products.get(i).getText().split("-");
	String FormattedName=productName[0].trim();
		List ItemsNeededList=Arrays.asList(itemsNeeded);
		int j=0;
		if(ItemsNeededList.contains(FormattedName))
		{
		j++;
		driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
		if(j==itemsNeeded.length) 
		{
			break;
		}
			
		}
			
		}	
	}

}
