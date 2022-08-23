import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String name = "Charu";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String password = extractpassword(driver);	
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();

			driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		   driver.findElement(By.tagName("p")).getText();
		   Thread.sleep(1000);
		   
		  
		   Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " +name+"," );  
// what we have provided as username that only will be visible in Home page , we no need to hasd code it while assertion.
		   // so creating one variable named String name = "charu";
    
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	
	public static String extractpassword(WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pwd = driver.findElement(By.cssSelector("form p")).getText().split("'")[1].split("1")[0];
		System.out.println(pwd);
		return pwd;
	}
	

}
