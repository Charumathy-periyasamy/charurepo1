import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// 1.print number of rows in the table
// 2. print number of columns in the table
// 3. print content of second row
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	
	int rowCount = driver.findElements(By.cssSelector("table[name='courses'] tr")).size();	
	
	int columnCount = driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(1) th")).size();
	
	String secondRowContent = driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText();
		
		
	System.out.println("rowcount: "+ rowCount);
	System.out.println("columncount: "+ columnCount);
	System.out.println("secondRowContent: "+ secondRowContent);
	
	//driver.findElement(By.id("product")).findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
	
// another approach
	
/*	WebElement table=driver.findElement(By.id("product"));



	System.out.println(table.findElements(By.tagName("tr")).size());



	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



	List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



	System.out.println(secondrow.get(0).getText());



	System.out.println(secondrow.get(1).getText());



	System.out.println(secondrow.get(2).getText());  */
	
	
	}

}
