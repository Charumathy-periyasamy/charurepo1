import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Charu");
		driver.findElement(By.id("alertbtn")).click();
// switching to alert
		
		 System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
// click confirm button
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
