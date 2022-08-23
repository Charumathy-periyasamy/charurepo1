import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class location3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//************SIBLING AND PARENET TRAVERSE (CHILD TO PARENT) ***************#	
	

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\Documents\\\\chromedriver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// XPATH FOR PARENT TO CHILD AND CHILT TO SIBLING	
	System.out.println(driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
	
// XPATH FOR CHILD TO PARENT -- path for same button with the concept of Child to parent traverse
	
	System.out.println(driver.findElement(By.xpath("//header/div/button/parent::div/parent::header/div/button[2]")).getText());
	
	
	}

}
