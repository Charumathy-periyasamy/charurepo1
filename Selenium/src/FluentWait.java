import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// click start button
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();
	/*	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
				
	WebElement f = wait.until(new Function<WebDriver, WebElement>(){
		
	
		
		public WebElement apply(WebDriver driver)
		{
			if( driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
			else
			{
				return null;
			}
		}
	});    */
	
	
	}
	}
	
