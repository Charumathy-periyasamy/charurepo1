package BasicPractisePage;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class BasicSeleniumFeatures {

	

	static WebDriver driver; 
	
	public static void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver\\chromedriver.exe"); // this code need to be provide inside some method only
		 
	    
	}
	
	public static void verifyBasicPageDetails() throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	String currenturl	= driver.getCurrentUrl(); 	
	
	Assert.assertEquals("https://rahulshettyacademy.com/AutomationPractice/", currenturl);
		
	System.out.println("Page title " + driver.getTitle());
	
	int sizeofRadioButtonField = driver.findElements(By.xpath("//fieldset/label/input[@name='radioButton']")).size();

// 1. click all the radio button using loop radio button
	
	for(int i = 1; i<= sizeofRadioButtonField ; i++)
	{
		driver.findElement(By.xpath("//fieldset/label["+i+"]/input[@name='radioButton']")).click();
	}
	
// 2. Enter the text 'ind' in capital letter and select the option 'india' in the auto suggestive dropdown
	
	Actions a = new Actions(driver);
	
	a.moveToElement(driver.findElement(By.cssSelector("input#autocomplete"))).click().keyDown(Keys.SHIFT).sendKeys("ind").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();
	
// the dropdown is not getting disappered	
	
	
// 3. select the option in the static dropdown field
	
WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	// driver.findElement(By.xpath("//option[3]")).click();

Thread.sleep(3000);
	staticdropdown.findElement(By.xpath("//option[@value='option1']")).click();
	
// selecting option using Select class
	
	Select s = new Select(staticdropdown);
	s.selectByIndex(1);
	Thread.sleep(4000);
//	s.deselectByIndex(1);
	//Thread.sleep(4000);
	
	
	s.selectByValue("option2");
	Thread.sleep(4000);
//	s.deselectByValue("option2");  // we can use deselect option only when the dropdown is multi select
	Thread.sleep(3000);
	s.selectByVisibleText("Option3");
//	Thread.sleep(3000);
	//s.deselectByVisibleText("Option3");
	Thread.sleep(3000);
//	s.deselectAll();
	
	
List<WebElement> selectedOptions =	s.getAllSelectedOptions();

for(WebElement w : selectedOptions)
{
	System.out.println(w.getText());
}
// System.out.println("selectedOptions in select dropdown  :" + selectedOptions );
	
System.out.println(" first selected option " +s.getFirstSelectedOption().getText());

List<WebElement> alloptions = s.getOptions();

for(WebElement w1 : alloptions)
{
	System.out.println("all options in the select tag : " + w1.getText());
}


// select the checkboxes

int checkboxSize = driver.findElements(By.xpath("//fieldset/label/input[@type='checkbox']")).size();

for(int j = 1; j<=checkboxSize;j++ )

{
	
	List<WebElement> checkboxes = driver.findElements(By.xpath("//legend[contains(text(),'Checkbox Example')]/parent::fieldset/label[" + j + "]/input"));


for(WebElement box: checkboxes)
{
	box.click();
	System.out.println("values of checkboxed : "+ box.getAttribute("value"));
}

}


// handling new window popups

driver.findElement(By.cssSelector("button#openwindow")).click();

String parentWindow = driver.getWindowHandle();

Set<String> windows = driver.getWindowHandles();

Iterator<String> it = windows.iterator();

while(it.hasNext())
{
	driver.switchTo().window(it.next());
	
	
	
	
}

String titleofChildWindowPopup = driver.getCurrentUrl();
System.out.println("titleofWindowPopup : "+ driver.getCurrentUrl());

 Assert.assertEquals(titleofChildWindowPopup, "http://www.qaclickacademy.com/");
 
Assert.assertEquals(driver.getCurrentUrl(), titleofChildWindowPopup, "Yeh! Successfully grabed the title of childwindow");
driver.close();
// switching to parent window

String titleOfParentWindow  = driver.switchTo().window(parentWindow).getCurrentUrl();
System.out.println(titleOfParentWindow);
Assert.assertEquals(titleOfParentWindow, "https://rahulshettyacademy.com/AutomationPractice/", "Yeh! Successfully grabed the title of parent window");
	
	
// handling more than 2 tabs

//	driver.findElement(By.xpath("//a[@id='opentab']")).click();

//	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	
// handling alert
	
driver.findElement(By.xpath("//fieldset/input[@placeholder='Enter Your Name']")).sendKeys("Charu");

// click Alert button

driver.findElement(By.cssSelector("#alertbtn")).click();

 System.out.println(driver.switchTo().alert().getText()); 
driver.switchTo().alert().accept();

// click the confirm button

driver.findElement(By.xpath("//input[@value='Confirm']")).click();

System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();

	
// scroll the page to down

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0,500)");
	
js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
	
// summ the value of all the rows 

List<WebElement> numberList = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
int rowcount = numberList.size();
int sum =0 ;

for(int i = 0;i<rowcount;i++)
{
	sum = sum + Integer.parseInt(numberList.get(i).getText());
}

System.out.println(sum);

System.out.println(driver.findElement(By.cssSelector("div.totalAmount")).getText());

String split = driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim();

System.out.println(sum);
System.out.println(split);

// Assert.assertEquals(split, sum);

WebElement mainmenu = driver.findElement(By.cssSelector("button[id='mousehover'"));

WebElement firstOptionInMainMenu = driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a"));

/*

// mouse hover

a.moveToElement(mainmenu).build().perform();
a.moveToElement(firstOptionInMainMenu).build().perform();
firstOptionInMainMenu.click();

*/

// Hide and show button

driver.findElement(By.cssSelector("input.displayed-class"));

driver.findElement(By.cssSelector("input[id='hide-textbox']")).click();

String att1 = driver.findElement(By.cssSelector("input[id='hide-textbox']")).getAttribute("style");

driver.findElement(By.cssSelector("input[id='show-textbox']")).click();

String att2 = driver.findElement(By.cssSelector("input[id='show-textbox']")).getAttribute("style");


	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp();
		driver = new ChromeDriver();
		verifyBasicPageDetails();
		
	}

}



