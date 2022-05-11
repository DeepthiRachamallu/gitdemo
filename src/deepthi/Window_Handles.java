package deepthi;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_Handles {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
	     Iterator<String> it=windows.iterator();
	     String parentId=it.next();
	     String ChildId=it.next();
	     System.out.println(parentId);
	     Thread.sleep(2000);
	     driver.switchTo().window(ChildId);
	     Thread.sleep(2000);
	     
	     driver.switchTo().window(parentId);

	
	
	}

}