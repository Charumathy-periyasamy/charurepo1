import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Addoncart {
	
	public static void additems(WebDriver driver, String[] veg) throws InterruptedException
	{
	List<WebElement> list =	driver.findElements(By.cssSelector("h4.product-name"));
	
//	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	
		for(int i=0;i<=list.size()-1;i++)
		{
		String name =	list.get(i).getText();
		// triming the 1 kg text 
		
	String sname =	name.split("-")[0].trim();
	
	  System.out.println("name: "+ sname);
	 
		if(name.contains(veg[1]) )
			{
			    System.out.println("veg[1]:"+ veg[1]);
			   
				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
			 
			}
			else if(name.contains(veg[0]))
			{
				System.out.println("veg[0]:"+ veg[0]);
				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				 Thread.sleep(9000);
			}   
		

	/*	List l = Arrays.asList(list);
		int count =0;
		if(l.contains(name))
		{
			Thread.sleep(6000);
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			Thread.sleep(6000);
			count++;
			
			if(count==list.size())
			{
				break;
			}
		}  */
		}
		
		// covert array to arraylist
		
		

	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	String[] veg = {"Brocolli","Cucumber"};	
		additems(driver, veg);
		// clicking the CARD SYMBOL
		
	driver.findElement(By.cssSelector("img[alt=Cart]")).click();
	driver.findElement(By.xpath("//button[@type='button'][contains(text(),'PROCEED TO CHECKOUT')]")).click();
	
	// value in the text box will not get inserted unless or until we provide implicit and explicit wait...
	// as there is a page redirection is there so, we need to wait for few seconds.
	// we are applying implict wait GLOBALLY
	
	// here implementing EXPLICIT WAIT
	
WebDriverWait w = new WebDriverWait(driver, 7);
w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='promoBtn']")));
	driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy"); // driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
	
	driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
		
	}

}
