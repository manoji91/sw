package testpackage;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://ct-akuratest/akura");
		driver.manage().window().maximize();
		
		//driver.findElement(Byname)
		
		//access test data sheet
		//FileInputStream file = new FileInputStream("C:\\Project\\data.xlsx");
		//HSSFWorkbook wb = new HSSFWorkbook(file);
		//HSSFSheet sheet = wb.getSheet("data");
		
		
	}

}
