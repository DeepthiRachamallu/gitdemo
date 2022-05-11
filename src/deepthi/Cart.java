package deepthi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws Exception {
	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
         List<WebElement> options=driver.findElements(By.cssSelector("h4.product-name"));
         System.out.println(options.size());
         for(int i=0;i<=options.size();i++)
         {
        	 String name=options.get(i).getText();
        	 System.out.println(name);
        	 if(name.contains("Cucumber")) 
        	 {
        		 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		 System.out.println("Add to cart  cucumber success full");
        		 break;
        	 }
         }
         
         for(int i=0;i<=options.size();i++)
         {
        	 String name=options.get(i).getText();
        	 System.out.println(name);
        	 if(name.contains("Cauliflower")) 
        	 {
        		 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		 System.out.println("Add to cart  cauliflower success full");
        		 break;
        	 }
         }
         
       
       
         
         
         
         
         
	////button[text()='ADD TO CART']
	
	
	
	
	
	
	}

}
