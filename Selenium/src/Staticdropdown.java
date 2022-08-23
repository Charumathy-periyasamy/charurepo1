import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
// static dropdwon
		WebElement element = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
				
		
	Select dropdown = new Select(element);
//	driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]/option[contains(text(),'USD')]"));
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText()); 
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	}

}
