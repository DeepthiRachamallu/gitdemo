package deepthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dp=new Select(dropdown);
		dp.selectByIndex(3);
		System.out.println(dp.getFirstSelectedOption().getText());		
		dp.selectByVisibleText("AED");
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByValue("INR");
		System.out.println(dp.getFirstSelectedOption().getText());
		
		
		
		

	}

}
