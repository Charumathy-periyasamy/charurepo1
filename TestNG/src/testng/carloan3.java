package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class carloan3 {

    @BeforeClass
	public void beforeclass()
	{
		System.out.println("beforecalss in carloan3");
	}
	
    @Test
	public void Carloan31()
	{
		System.out.println(" method Carloan31");
	}
    
    @Test (enabled=false)
   	public void AACarloan31()
   	{
   		System.out.println(" method AACarloan31");
   	}
    
    @Test(timeOut = 900000)
	public void WebLoginCar()
	{
		System.out.println(" WebLoginCar carloan3");
	}
    
    @Test
  	public void MobileLoginCar()
  	{
  		System.out.println(" MobileLoginCar carloan3");
  	}
      
    
    @Test (dependsOnMethods = {"WebLoginCar","MobileLoginCar"})  // webloagincar and mobilelogincare also executing aplphabetical order
   	public void ApiLoginCar()
   	{
   		System.out.println(" ApiLoginCar carloan3");
   	}
	
    @Test  (groups= {"Smoke"})
	public void Acarloan31()
	{
		System.out.println(" method Acarloan31");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass in carloan3");
	}
	
}
