package sel;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import com.thoughtworks.selenium.*;
import org.openqa.*;
import com.thoughtworks.selenium.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Exception;
import java.sql.Driver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteAPI {
					
	    WebDriver driver;

		@BeforeTest
		public void startTest() throws InterruptedException{
		
	
		    //Chrome Drivers
		   
		    System.setProperty("webdriver.chrome.driver", "C:/Sel/eclipse-jee-mars-2-win32-x86_64/eclipse/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //URL Settings

            driver.get("https://ec2-52-48-105-34.eu-west-1.compute.amazonaws.com:9444/publisher/site/pages/login.jag");


            //User login

            driver.findElement(By.id("username")).clear();

            driver.findElement(By.id("username")).sendKeys("admin");

            driver.findElement(By.id("pass")).clear();

            driver.findElement(By.id("pass")).sendKeys("admin");          

            driver.findElement(By.className("btn")).click();
                       
            WebDriverWait wait0 = new WebDriverWait(driver, 300);    
            wait0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div/form/div[1]/div/div/input[1]")));
                                     
            driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div/form/div[1]/div/div/input[1]")).sendKeys("ghtfghghgdf");                  
           
            driver.findElement(By.className("form-control-btn")).click();
           
            driver.findElement(By.xpath(".//*[@class='fw fw-delete fw-stack-1x']")).click();
           
                 
           //Confirmation pop-up for delete
                     
           
           WebDriverWait wait1 = new WebDriverWait(driver, 300);    
           wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='btn btn btn-primary']")));
           
           
           driver.findElement(By.xpath(".//*[@class='btn btn btn-primary']")).click();                           
           
           //driver.findElement(By.xpath(".//*[@class='icon fw-stack']")).click(); 
          
	}

		 @Test 
	       public void test(){
			 
		 }	    	   	    	
	       			
	       public void AfterTest(){
	    	   
	    	
			driver.close();
			
	       }


public static void main(String[] args) {
		
}

}
