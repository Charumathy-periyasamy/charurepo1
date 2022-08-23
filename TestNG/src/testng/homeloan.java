package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class homeloan {
	
	 @Parameters({"url"})
	@Test  (groups= {"Smoke"})
	public void homeloan1(String url) // if i execute testng3 this method will show error as @Parameter is not mentioned in testng3
	{
		System.out.println("Homeloan 1");
		System.out.println("url form parameter on suite level : " +url);
	}
	
	@Test
	public void homeloan2()
	{
		System.out.println("Homeloan 2");
		
		
	}
	
	@Parameters({"homeurl"})
	@Test
	public void homeloan3(String url)
	{
		System.out.println("Homeloan 3");
		System.out.println("paramer on test module level : "+ url);
	}
	
	@Parameters({"classlevelurl"})
	@Test
	public void homeloan4(String classleveparameter) {
		
		System.out.println("classleveparameter ");
	
		System.out.println("paramer on class level : "+ classleveparameter);
	}
	   
}
