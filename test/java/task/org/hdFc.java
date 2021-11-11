package task.org;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hdFc {
	static WebDriver driver;
	
@BeforeClass

public static void launch(){
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
}

@Test
	public void fraMe() {
	
	WebElement f = driver.findElement(By.className("dropdown-toggle"));
	Actions acc = new Actions(driver);
	acc.moveToElement(f).perform();
	driver.findElement(By.xpath("//a[text()='Frames']")).click();
	
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	driver.switchTo().frame(1);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("vidhya");
	
	
	
	

	
	
}

}



