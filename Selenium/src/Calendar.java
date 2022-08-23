import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		// click the date field
		
		driver.findElement(By.xpath("//input[@value='Date of Travel']")).click();
// selecting month
		
	while(!driver.findElement(By.cssSelector("[class=' table-condensed'] thead tr [class='datepicker-switch']")).getText().contains("October"))
	{
		driver.findElement(By.cssSelector("[class=' table-condensed'] thead tr [class='next']")).click();
	}
		
		
// selecting date		
	List<WebElement> dates =	driver.findElements(By.className("day"));
	int size = dates.size();
	
	for(int i=0;i<size;i++)
	{
		String actualdate = dates.get(i).getText();
		if(actualdate.equals("14"))
		{
			dates.get(i).click();
			break;
		}
	}
		
	}

}
