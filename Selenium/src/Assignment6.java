import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// select the check box
		
		driver.findElement(By.xpath("//label[@for='bmw']/input")).click();
		String checkBoxLabel = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
	System.out.println(checkBoxLabel);
	
	// select the same Option1 in static dropdown field
	
	WebElement dropdown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
	
	Select staticdropdown = new Select(dropdown);
	staticdropdown.selectByVisibleText(checkBoxLabel);
	
	
	
	// provide Option1 value in the textbox of Alert
	
	driver.findElement(By.cssSelector("input[id='name']")).sendKeys(checkBoxLabel);
	// click the Alert button and verify that the text Option1 is there in the Alert popup
	
	driver.findElement(By.id("alertbtn")).click();
	
	String alerttext = driver.switchTo().alert().getText();
	 
	//Assert.assertEquals(checkBoxLabel,alerttext.contains(checkBoxLabel));
	
	if(alerttext.contains(checkBoxLabel))
	{
		System.out.println("success");
	}
	else
	{
		System.out.println("failed");	
	}
	driver.switchTo().alert().accept();
	
	}

}
