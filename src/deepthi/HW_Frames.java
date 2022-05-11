package deepthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		System.out.println("Enter into frame");
		
		


	}

}
