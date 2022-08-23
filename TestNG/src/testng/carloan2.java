package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carloan2 {

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Aftersutie");
	}
	
	@Parameters({"url"})
	@Test(groups= {"Smoke"})
	public void carloan2Vr1(String url)   // if i execute testng3 this method will show error as @Parameter is not mentioned in testng3
	{
		System.out.println("carloan2vr1");
		System.out.println("suite level url : " + url);
	}
	
	@Test(groups= {"Smoke"})
	public void barloan2Vr2()
	{
		System.out.println("carloan2vr2 ");
	}
	
	@Test(groups = {"Smoke"})
	public void carloadn2vr3()
	{
		System.out.println("carloadn2vr3");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Beforesutie");
	}
	
}
