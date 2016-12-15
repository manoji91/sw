package api;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class API {

	public  WebDriver dr;
	//public static void main(String[] args) throws Exception {
	
	@BeforeTest
	public void Login() throws InterruptedException{
		// TODO Auto-generated method stub

        WebDriver dr = new FirefoxDriver();
        
        dr.manage().window().maximize();
        //launch
        dr.get("https://ec2-52-48-105-34.eu-west-1.compute.amazonaws.com:9446/carbon/admin/login.jsp");
       
        //login
        
        dr.findElement(By.id("txtUserName")).clear();
        dr.findElement(By.id("txtUserName")).sendKeys("admin");
        dr.findElement(By.id("txtPassword")).clear();
        dr.findElement(By.id("txtPassword")).sendKeys("admin");
        dr.findElement(By.className("button")).click();
      //  dr.findElement(By.xpath("//a[contains(text(),'APIs')]")).click();
        Thread.sleep(4000);
        
	
     
        dr.findElement(By.xpath("//a[contains(text(),'APIs')]")).click();
        // dr.findElement(By.xpath(".//*[@id='region1_manage_menu']"));
        dr.findElement(By.cssSelector("a[href*='../api/index.jsp?region=region1&item=rest_api_menu']")).click();
        dr.findElement(By.cssSelector("a[href*='manageAPI.jsp?mode=add']")).click();
        dr.findElement(By.xpath(".//*[@id='apiForm']/table/thead/tr/th/a")).click();	
        
        //edit Template
        
        Thread.sleep(4000);
       // dr.findElement(By.cssSelector("")).sendKeys(Keys.END);
        
    //  String test =  dr.findElement(By.id("textarea")).getText();
      
   //   System.out.println("Selected "+test);
   //    dr.findElement(By.id("textarea")).sendKeys("<api xmlns=\"http://ws.apache.org/ns/synapse\" name=\"\" context=\"\"/>\n ggg\n    sssss");
        
        Thread.sleep(4000);
        

      WebElement fr = dr.findElement(By.id("frame_api_source"));
      dr.switchTo().frame(fr);

      System.out.println("Frame Selected");
      String Txt_File_Data = "TestfileDate" ; // pass the excel value here
      dr.findElement(By.id("textarea")).sendKeys(Keys.END);  
      dr.findElement(By.id("textarea")).sendKeys("\n"     +Txt_File_Data);  
      dr.switchTo().defaultContent();
     
     
      
	}
	
	@Test
	public void test2(){
		System.out.println("Test");
	}

	

	

}
