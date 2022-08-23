import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Scrolling the page and scrolling the webtable using java script executeor

public class webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// scrolling the entire page
		// window.scrollBy(0,500) ---- is javascript code which we need to put inside the java script executor
		
		js.executeScript("window.scrollBy(0,500)");
		
	// to scroll the webtable
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
	// to scroll the horizontal bar we can use the method -- document.querySelector(".tableFixHead").scrollLeft=2000	

	
	
// sum all the numbers in a column of a table and compare it with the total amount
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead tbody tr td:nth-child(4)"));
int sum =0;
for(int i=0;i<values.size();i++)
{
	 // parsing the string into Integer
	System.out.println(Integer.parseInt(values.get(i).getText()));
	sum = sum+Integer.parseInt(values.get(i).getText());
	System.out.println(sum);
}

int total = Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(": ")[1]);
System.out.println("total:" + total);

Assert.assertEquals(sum, total);
	}

}
