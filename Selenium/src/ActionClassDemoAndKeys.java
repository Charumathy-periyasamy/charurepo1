import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemoAndKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
	//	driver.manage().window().maximize();
		
		WebElement move = driver.findElement(By.xpath("//span[@class='nav-line-2 '][contains(text(),'Account & Lists')]"));
		WebElement searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox")) ;
		
		Actions a = new Actions(driver);
	
		// mover hover at the specific location
		a.moveToElement(move).build().perform();
		
// move the mouse on the search box, click it , hold the shift key and enter 'hello' text -- this will provide 'hello' text in CAPITAL LETTERS
		// how to select the entire text using mouse -- using DOUBLE CLICK -- we are implementing DOUBLE CLICK here
		a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//	a.moveToElement(searchbox).doubleClick().build().perform();
		
// move the move to a specific location and right click on it
		
       a.moveToElement(move).contextClick().build().perform();
		
		
		
		
// 		
		
		
		

	}

}
