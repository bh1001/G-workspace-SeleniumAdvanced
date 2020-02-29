package nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
	WebElement link =driver.findElement(By.linkText("SIGN-ON"));
		
		link.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
		
        WebElement link1 =driver.findElement(By.linkText("REGISTER"));
		
		link1.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
	}

}
