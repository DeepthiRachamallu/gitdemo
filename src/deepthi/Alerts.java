package deepthi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Deepthi");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	
	driver.findElement(By.id("confirmbtn")).click();
	Alert alert1=driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert.dismiss();
		

	}

}
