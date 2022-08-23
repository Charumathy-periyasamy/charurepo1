import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		/*
// how to set proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:2222");
		options.setCapability("proxy", proxy);
	
*/
		
/*   // adding extension in chrome 
		
		options.addExtensions(new File("filkepage"));
		
		*/
		
/*
		// how to block unwanted popups:
		
		
		options.setExperimentalOption("excludeSwitchs", Arrays.asList("disable-popup-blocking"));
	*/	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
	System.out.println(driver.getTitle());	
		driver.close();
		
		
		
	}

}
