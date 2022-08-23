import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeysUsage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	//	WebElement page = driver.findElement(null)
	WebElement value =	driver.findElement(By.id("autocomplete"));
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_UP).build().perform();
	Thread.sleep(2000);
	
	
	value.sendKeys(Keys.ARROW_RIGHT);
	Thread.sleep(2000);
	value.sendKeys(Keys.ARROW_LEFT);
	Thread.sleep(2000);
	value.sendKeys("indiaa");
	Thread.sleep(2000);
	value.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	value.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	value.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	value.sendKeys(Keys.ARROW_UP);
	Thread.sleep(2000);
	value.sendKeys(Keys.ENTER);	
	Thread.sleep(2000);
	
//keys.chord() method is useful to press multiple keys
	
	// I want to select element using Control + A
	
	value.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	Thread.sleep(2000);
	value.sendKeys(Keys.CONTROL);
		
	value.sendKeys(Keys.DELETE);	
	
	}

}
