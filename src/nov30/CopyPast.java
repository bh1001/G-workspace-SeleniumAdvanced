package nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement userName =driver.findElement(By.name("userName"));
		
		userName.sendKeys("batman");
		
		Actions action = new Actions(driver);
		
		action.doubleClick(userName).build().perform();
		userName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		WebElement password =driver.findElement(By.name("password"));

		password.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		driver.findElement(By.name("login")).click();
		
		
	}

}
