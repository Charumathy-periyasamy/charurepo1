import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEnd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
	/*	if (driver.findElement(By.xpath("//div[@id='main-message']")).isDisplayed())
		{
			driver.findElement(By.cssSelector("button#details-button")).click();
			driver.findElement(By.xpath("//p[@id='final-paragraph']/a")).click();

			}  */
		
		driver.manage().window().maximize();

//Requirement 1 : Give me the count of the links on the page
		
  System.out.println(driver.findElements(By.tagName("a")).size());
  
//Requirement 2 :  Give me the link count on the footer

  /* CONCEPT OF LIMITING THE SCOPE OF driver */
  
  // count  number of link only in the footer section... for this we need to limit the scope of the driver
  // only to footer means, now driver a access to all the elements in DOM  now we need to create a sub or mini driver
  // which should have access to only footer 
  
  WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
  
System.out.println(footerdriver.findElements(By.tagName("a")).size());


// Requirement 3 : Give me the link count of the first column in the footer

WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
 System.out.println(columndriver.findElements(By.tagName("a")).size());
 
 
 // Requirement 4 : Click on each link and check if the pages are opening
 
 for(int i =1;i<columndriver.findElements(By.tagName("a")).size();i++)
 {
	// open the all the link in different tabs using KEYS
	 
	String clicklink = Keys.chord(Keys.CONTROL, Keys.ENTER);
	 
	 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	 
 }
	 
// get the title of Child window
	 
	 Set<String> windows = driver.getWindowHandles();
	 Iterator<String> it = windows.iterator();
	 
	 String parentwindow = it.next();
	while(it.hasNext())
	{
		String childwindow = it.next();
		System.out.println(driver.switchTo().window(childwindow).getTitle());
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	 


	}
	
	
	

}
