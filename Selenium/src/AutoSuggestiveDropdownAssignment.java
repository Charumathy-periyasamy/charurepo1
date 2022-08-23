import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
Thread.sleep(3000);


// entering value in auto suggestive dropdown

JavascriptExecutor js =(JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,500)");
js.executeScript("document.getElementById('autocomplete').value='ind'");
Thread.sleep(5000);
driver.findElement(By.id("autocomplete")).click();
Thread.sleep(5000);

driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
	}

}
