import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitWaitAssignment {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");	
		driver.manage().window().maximize();
		// extract username and password
	String username =	driver.findElement(By.xpath("//p[@class='text-center text-white']/b")).getText();
	String pwd =	driver.findElement(By.xpath("//p[@class='text-center text-white']/b/following-sibling::b")).getText();
	
	// enter user name
	driver.findElement(By.name("username")).sendKeys(username);
	// enter password
	driver.findElement(By.name("password")).sendKeys(pwd);
	
// click the User radio button
	driver.findElement(By.xpath("//label[@class='customradio']/span[contains(text(),'User')]/parent::label/descendant::span[@class='checkmark']")).click();
	
	// Click OK in the Alert popup!!

	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
//	driver.switchTo().alert().accept();  -- this is not alert popup
	
	driver.findElement(By.cssSelector("#okayBtn")).click();
	
	// select option in dropdown
	
	driver.findElement(By.xpath("//select/option[@value='consult']")).click();
	
	// click the checkbox
	
	driver.findElement(By.cssSelector(".text-info span input")).click();
	
	// click sign-in button
	driver.findElement(By.id("signInBtn")).click();
	
	w.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
	Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/angularpractice/shop");
	
	
		
		
	}

}
