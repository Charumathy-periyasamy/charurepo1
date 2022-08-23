import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//body/a[@class='blinkingText']")).click();
		// to get to know how may windows are opened by seleniem
		// window variable will have instance of all the opened windows
		Set<String> windows = driver.getWindowHandles();
		
		// we need get the ID of the child window --- 
		 
		Iterator<String> it = windows.iterator();
		// control will got child window
		String parentid = it.next(); // control is on 0th index
		String childid = it.next();  // control is on 1st index
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
	//	System.out.println(driver.findElement(By.cssSelector("p.im-para.red strong a")).getText()); 
	String emailid =	driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split("with")[0].trim();
  
	// switch again to parent window
	
	//driver.switchTo().defaultContent();
	driver.switchTo().window(parentid);
	driver.findElement(By.name("username")).sendKeys(emailid);
	
	


 
		
		
	}

}
