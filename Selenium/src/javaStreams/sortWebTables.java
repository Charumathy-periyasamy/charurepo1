package javaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class sortWebTables {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
	
	
	//	System.out.println("unsortedList::"+unsortedList );
		
		// click the column heading to sort
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// fetch the unsorted list
		List<WebElement> unsortedList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
	List<String> originalList =	unsortedList.stream().map(s -> s.getText()).collect(Collectors.toList());
	
	System.out.println(originalList);
	
	List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList);
	
	Assert.assertTrue(originalList.equals(sortedList));
	
// GET THE PRICE OF THE ITEM IN THE WEBTABLE
	//Normal way === //tbody/tr/td[contains(text(),'Beans')]
	
	// USING STEAMS
	List<String> price;
do
{
	List<WebElement> elementlist = driver.findElements(By.xpath("//tbody/tr/td[1]"));
 price = elementlist.stream().filter(s -> s.getText().contains("Rice")).map(s-> getPrice(s)).collect(Collectors.toList());
  
	price.forEach(s -> System.out.println(s));
	System.out.println(price);
	
	if(price.size()<1)
	{
		driver.findElement(By.xpath("//a[@aria-labeL='Next']")).click();
	}

}	while(price.size()<1);

// Filtering the options
 WebElement searchField = driver.findElement(By.id("search-field"));
 searchField.sendKeys("Rice");
 List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
 
 for(WebElement w : veggies)
	 
 {
	 System.out.println(w.getText());
	 if(w.getText().contains("Rice"))
	 {
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.assertFalse(false);
	 }
 }
 
 
 // Filter the options using STREAMS
 
 Actions a = new Actions(driver);
 driver.findElement(By.xpath("//tr/td[contains(text(),'Rice')]")).click();
 a.moveToElement(searchField).doubleClick().sendKeys(Keys.DELETE).build().perform();
 

 searchField.sendKeys("Rice");
 
 List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
 
 List<WebElement> filteredlist = list.stream().filter(veggie -> veggie.getText().contains("Rice")).collect(Collectors.toList());
 
 Assert.assertEquals(list.size(), filteredlist.size());
	}
	

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
	}

}
