package dec1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://newtours.demoaut.com/");
				
				
			/*	driver.findElement(By.name("userName")).sendKeys("batman");
				driver.findElement(By.name("password")).sendKeys("batman");
				driver.findElement(By.name("login")).click();
				"
				driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='tripType' and contains(@value,'roundtrip')]")).click();

	
	*/
	//driver.findElement(By.xpath("//a[starts-with(@id,'nav-link-acc')]")).click();
	
			//	driver.findElement(By.id("user-message")).sendKeys("Hello");
				//driver.findElement(By.xpath("//button[text()='Show Message']")).click();
				
				driver.findElement(By.name("userName")).sendKeys("batman");
				
				List<WebElement> ele= driver.findElements(By.xpath("//input[@name='userName']//following::input"));
				System.out.println(ele);
				driver.findElement(By.xpath("//input[@name='userName']//following::input")).sendKeys("batman");
				driver.findElement(By.xpath("//input[@name='userName']//following::input[2]")).click();

				
				
}
}
