import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowactivies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
// Maximise the window:
		driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.navigate().to("https://rahulshettyacademy.com");
	driver.navigate().back();
   driver.navigate().forward();

   
	}

}
