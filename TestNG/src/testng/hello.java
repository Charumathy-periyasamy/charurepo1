package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hello {

/*	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
	}

*/
	
	// using data provider
	
	
	@Test(groups= {"Smoke"},dataProvider = "getData")
	public void Ztest(String username, String password)
	{
		System.out.println("hello");
		
		System.out.println("username : " + username + " passwornd :" + password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;
	
	}

}
