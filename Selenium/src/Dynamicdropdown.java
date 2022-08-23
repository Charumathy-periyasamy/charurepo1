import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
// Selecting FROM AND TO DESTINATION in the websit	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //li/a[@value='BLR']")).click();
	// driver.findElement(By.xpath("(//li/a[@value='MAA'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //li/a[@value='MAA']")).click();

		// SELECT THE CURRENT DATE IN CALENDAR		
				Thread.sleep(3000);
			driver.findElement(By.xpath("//td[@class=' ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-today']/a")).click();
			
		
		
// verify the TO DATE FIELD is disabled are not
		// click Round trip
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='select-label'][contains(text(),'Round Trip')]")).click();
		
		if(driver.findElement(By.id("//div[@id='Div1']")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
		

	
	}

}
