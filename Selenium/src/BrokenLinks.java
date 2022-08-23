import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	String url =	driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		//URL connection = new URL(url);
	//HttpURLConnection ht =	(HttpURLConnection)connection.openConnection();
	
	HttpURLConnection ht = (HttpURLConnection)new URL(url).openConnection();
	ht.setRequestMethod("HEAD");
	ht.connect();
	int respcode = ht.getResponseCode();	
	System.out.println(respcode);
		
	List<WebElement> list = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	 SoftAssert a = new SoftAssert();
	for(WebElement l : list)
	{
		HttpURLConnection ht1 = (HttpURLConnection)new URL(l.getAttribute("href")).openConnection();
		ht1.setRequestMethod("HEAD");
		ht1.connect();
		int respcode1 = ht1.getResponseCode();	
		System.out.println("respcode1:"+respcode1);
// Hard assertion	
//		  Assert.assertFalse(respcode1>400, l.getText()+"is broken with" + respcode1);
	//	  
// soft assertion
		  
		 
		  a.assertFalse(respcode1>400, l.getText()+"is broken with" + respcode1);
	
//			if(respcode1>400)
			//	{
				//	System.out.println(l.getText()+"is broken with" + respcode1);
				//	Assert.assertTrue(false);
//			}
			//	else
			//	{
			//		Assert.assertTrue(true);
			//	}
		
		 
	}
	
	a.assertAll();  // if assertAll() is not called then all the report will get stored but not get reprted
	
		
	}

}
