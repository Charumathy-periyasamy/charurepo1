import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Charu");
		driver.findElement(By.name("inputPassword")).sendKeys("testpassword");
		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Charumathy");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("charumathy1111@gmail.com");
	// to clear the email
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("charumathy1111@gmail.com");
		// driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	//	driver.findElement(By.cssSelector("input[type='text']:nth-child(2)"));
	// child(2) is not pointing the email ffield so going for next index
	//	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("charumathy1111@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8765443357");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
//	driver.findElement(By.xpath("//d6iv[@class='forgot-pwd-btn-conainer']/button[@class='go-to-login-btn']")).click();
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Charu");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//span/input[@id='chkboxOne']")).click();
	driver.findElement(By.xpath("//span/input[@id='chkboxTwo']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	
	
	

	
		
	}

}
