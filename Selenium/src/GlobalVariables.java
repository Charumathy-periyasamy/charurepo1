import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariables {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ELCOT\\Documents\\Selenium\\Selenium\\src\\properties.properties");
		prop.load(fis);
		
	System.out.println(prop.getProperty("browser"));	
	
	FileOutputStream fos = new FileOutputStream("C:\\Users\\ELCOT\\Documents\\Selenium\\Selenium\\src\\properties.properties");
	prop.setProperty("browser", "firefox");	
	prop.store(fos,null);
	
	
	System.out.println(prop.getProperty("browser"));	
	}

}

// using this we can dynamically read and write data in the properties file