import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomsuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
Thread.sleep(3000);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
    List<WebElement> list =   driver.findElements(By.cssSelector("li.ui-menu-item a"));
	
for(WebElement element: list)
{
	if(element.getText().equalsIgnoreCase("India"))
{
	element.click();
	break;
}
}
	}

}
