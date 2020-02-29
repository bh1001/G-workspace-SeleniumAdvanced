package nov30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");

		//driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")).click();
		
		//driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr[4]/td[3]")).click();
		
		driver.get("https://demoqa.com/datepicker/");
		driver.findElement(By.id("datepicker")).click();
		String  monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYear);
		
		while(! monthYear.equals("January 2020")) {
			
		}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	}
}


		
	List<WebElement> allRows = driver.findElements((SearchContext) By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		for (WebElement row : allRows) {
			List<WebElement> allCells = row.findElements(By.tagName("td"));
			for (WebElement cell : allCells) {
				String day = cell.getText();
				if(day.equals("26")) {
					cell.click();
					break;
				}
				
			}
		
	
		}
}}
