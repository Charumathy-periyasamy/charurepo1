import java.io.File;

import org.opache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// To take screenshot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// now the screenshot has been taken, now that screenshotis there on src object
		// let copy the screenshot and save it in our local
		
		FileUtils.copyFile(src,new File("C:\\Users\\ELCOT\\Downloads"));
		
		// Broken links
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	String href =	driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
				
	}

}
