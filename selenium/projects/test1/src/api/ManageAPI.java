package api;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

 

public class ManageAPI {

    private WebDriver dr;

    @BeforeSuite

    public void Longin() throws Exception {

        System.out.println("You are testing in firefox");

        dr = new FirefoxDriver();
        
        dr.get("https://ec2-52-48-105-34.eu-west-1.compute.amazonaws.com:9446/carbon/admin/login.jsp");
        dr.manage().window().maximize();
        //login
        
        dr.findElement(By.id("txtUserName")).clear();
        dr.findElement(By.id("txtUserName")).sendKeys("admin");
        dr.findElement(By.id("txtPassword")).clear();
        dr.findElement(By.id("txtPassword")).sendKeys("admin");
        dr.findElement(By.className("button")).click();
      //dr.findElement(By.xpath("//a[contains(text(),'APIs')]")).click();
        Thread.sleep(4000);
      
    }



    @Test
    public void Test_API() throws InterruptedException, Exception {

       
    /*dr.findElement(By.xpath("//a[contains(text(),'APIs')]")).click();
    // dr.findElement(By.xpath(".//*[@id='region1_manage_menu']"));
    dr.findElement(By.cssSelector("a[href*='../api/index.jsp?region=region1&item=rest_api_menu']")).click();
    dr.findElement(By.cssSelector("a[href*='manageAPI.jsp?mode=add']")).click();
    dr.findElement(By.xpath(".//*[@id='apiForm']/table/thead/tr/th/a")).click();	
    */
    	
    	
    dr.findElement(By.xpath("//a[contains(text(),'APIs')]")).click();

    //Add API
    dr.findElement(By.xpath("//a[contains(text(),'Add API')]")).click();
    dr.findElement(By.id("api.name")).clear();
    dr.findElement(By.id("api.name")).sendKeys("VirtusaPolarisTest");
    dr.findElement(By.id("api.context")).clear();
    dr.findElement(By.id("api.context")).sendKeys("/VirtusaPolarisTest/api");
    dr.findElement(By.xpath("//a[contains(text(),'Switch to source view')]")).click();
  
    Thread.sleep(4000);
  
	  WebElement fr = dr.findElement(By.id("frame_api_source"));
	  dr.switchTo().frame(fr);
	
	  System.out.println("Frame Selected");
	  

	  File src = new File("C:\\Users\\umpfernando\\Downloads\\InputData.xlsx");
		
	  FileInputStream fis =new FileInputStream(src);
		
	//change it to xss type (load the excel sheet)
    	XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		
			
		XSSFSheet sheet1 = xsf.getSheetAt(2);
		
		//getting rows and columns
		
		int rowcount = sheet1.getLastRowNum();
		String data0=null;
		for(int i=1;i<=rowcount;i++)
		{
			
					data0 = sheet1.getRow(i).getCell(1).getStringCellValue(); 
					String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
					System.out.println("username "+data0);
					System.out.print("password "+data1);
					System.out.println("\n");
					
				
					String Txt_File_Data = data0; // pass the excel value here
					dr.findElement(By.id("textarea")).sendKeys(Keys.END);  
					dr.findElement(By.id("textarea")).sendKeys("\n"     +Txt_File_Data);  
					 

		}
		
		dr.switchTo().defaultContent();
		dr.findElement(By.xpath(".//*[@id='api.source.form']/table/tbody/tr[3]/td/input[1]")).click();
		Thread.sleep(2000);
		
	
	 /* String Txt_File_Data = data0; // pass the excel value here
	  dr.findElement(By.id("textarea")).sendKeys(Keys.END);  
	  dr.findElement(By.id("textarea")).sendKeys("\n"     +Txt_File_Data);  
	  dr.switchTo().defaultContent();*/

   
   }
 
    @Test
    public void Test_test2(){
    	  System.out.println("Test2");
    }

    @AfterSuite

    public void quitDriver() throws Exception {

        dr.quit();

    }

}
