package task.org;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fraMe {
	static WebDriver driver;

	@BeforeClass
		public static void url()  {
		
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		   driver.manage().window().maximize();
		    
		}
	
		   @Test
		   public void fRame() 
		   {
		    driver.findElement(By.name("login_page"));
		    driver.switchTo().frame(0);
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vidhya");
		    
		}
	}


