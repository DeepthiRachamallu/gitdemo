package deepthi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		//month July
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("July"))
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).click();
			
		}
		
		
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
			{
			String text=driver.findElements(By.className("day")).get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("7"))
			{
			
				driver.findElements(By.className("day")).get(i).click();
				System.out.println("Successfull");
				break;
			}
			};
 
	}

}
