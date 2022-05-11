package deepthi;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] veggiesNeeded= {"Cucumber","Brocolli","Carrot","Brinjal","Raspberry"};
		int j=0;
		
		List<WebElement> options=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<options.size();i++) {
		
			String[] name=options.get(i).getText().split("-");
			String formattedname=name[0].trim();
			List veggiesList=Arrays.asList(veggiesNeeded);
			
		if(veggiesList.contains(formattedname)) 
		{
		j++;
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==veggiesNeeded.length) 
		{
			break;
		}
			
		}	

	}
//driver.close();
		
		
}
}