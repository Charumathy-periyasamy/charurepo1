import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	// switch to iframe	
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
	int framecount = 	driver.findElements(By.tagName("iframe")).size();
	// drag and drop
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div#droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		System.out.println(framecount);
		
		
		
	}

}
