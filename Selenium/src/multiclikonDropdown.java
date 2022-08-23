import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sun.source.tree.CompoundAssignmentTree;

public class multiclikonDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".paxinfo")).click();
      int i = 1;
      while(i<5)
      {
    	  driver.findElement(By.id("hrefIncAdt")).click();
    	  i++;
      }
        
	driver.findElement(By.id("btnclosepaxoption")).click();
	 System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());
	 
	 
// CLICK CHECKBOXES
	 
	 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	 System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); 
	 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
// count number of checkboxes
	 System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 
	 
	 //Assignment 1
	// 
	 //Thread.sleep(2000);
	//driver.findElement(By.xpath("//fieldset/label/input[@id='checkBoxOption1']")).click();
	//Assert.assertTrue(driver.findElement(By.xpath("//fieldset/label/input[@id='checkBoxOption1']")).isSelected());
	//driver.findElement(By.xpath("//fieldset/label/input[@id='checkBoxOption1']")).click();
	//Assert.assertFalse(driver.findElement(By.xpath("//fieldset/label/input[@id='checkBoxOption1']")).isSelected());
	
	//int size = driver.findElements(By.xpath("//label/input[@type='checkbox']")).size();

	
	
	
	
	}
	
	

}
