package deepthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChecKBox1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println((driver.findElement(By.id("checkBoxOption1"))).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println((driver.findElement(By.id("checkBoxOption1"))).isSelected());
		
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
