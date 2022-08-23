package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carloan {
	@Test (groups = {"Smoke"})  // this will not execute via testng3  as this method has not been mentioned int tesng3
	public void carloan1()
	{
		System.out.println("carloan 1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Will get execute before each testcase");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("will get execute after each testcase");
	}
	
	@Parameters({"key", "url"})
	@Test
	public void homeloanoncar1(String key, String url)
	{
		System.out.println("homeloanoncar1");
		System.out.println("key parametter: " + key + " and url: " + url);
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Will get execute before the test module in testng");
	}
	
	
	@Test
	public void homeloanoncar2()
	{
		System.out.println("homeloanoncar2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Will get execute after the test module in testng");	
	}
	
}
