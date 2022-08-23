import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//li/a[contains(text(),'Nested Frames')]")).click();
	driver.switchTo().frame(driver.findElement(By.name("frame-top")));
	 driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
	System.out.println(driver.findElement(By.xpath("//html/body/div[contains(text(),'MIDDLE')]")).getText());

	}

}
