package deepthi;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_Array {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] veggiesneed= {"Cucumber","Brocolli","Carrot"};
		int j=0;
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) {
		String[] name=products.get(i).getText().split("-");
		String formattedname=name[0].trim();
		
		//Array converted to arrayList
		
		List<String> itemsNeededList=Arrays.asList(veggiesneed);
		
		
		
		if(itemsNeededList.contains(formattedname)) 
		{
			j++;
		 
		 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			if(j==3)
			{
			break;	
			}
			
		}
		
		
		
		}

	}

}
