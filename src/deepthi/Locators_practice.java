package deepthi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_practice {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
    driver.findElement(By.name("inputPassword")).sendKeys("hellow123");
    driver.findElement(By.className("signInBtn")).click();
   System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
    driver.findElement(By.linkText("Forgot your password?")).click();
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jhon");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@abc.com");
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("jhon");
    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
    driver.findElement(By.id("chkboxOne")).click();
    driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
    Thread.sleep(2000);
    
     
     
     driver.close();//rahulshettyacademy
	}

}
