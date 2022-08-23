package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	
	WebElement nameTextBox =	driver.findElement(By.xpath("//input[@name='name']"));
		
	String NameLable =	driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText();
	System.out.println("NameLable: " + NameLable);
	

	// using below() locator
	
	// label[for='dateofBirth'] label
	
	WebElement dateOfBirthLabel = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
	
	
	
	}

}
