import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to delete all cookies
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
	// to delete specific cookie
		driver.manage().deleteCookieNamed("name of the cookie");
		
	}

}
