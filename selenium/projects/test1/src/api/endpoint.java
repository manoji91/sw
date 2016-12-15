package api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class endpoint {

	public static void main(String[] args) throws InterruptedException {
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
        
        //createAPI(2)
        dr.findElement(By.xpath(".//*[@id='region1_manage_menu']"));
        dr.findElement(By.xpath(".//*[@id='menu']/ul/li[5]/ul/li[4]/ul/li[5]/a")).click();
        dr.findElement(By.xpath(".//*[@id='tabs']/ul/li[3]/a")).click();
        Thread.sleep(2000);
        dr.findElement(By.xpath(" .//*[@id='endpointOptionTable']/tbody/tr[4]/td[1]/a")).click();
        
        //enter name 
        dr.findElement(By.xpath(".//*[@id='endpointName']")).sendKeys("VirtusaPolarisEndPoint");
        
        //enter http url template
        dr.findElement(By.xpath(".//*[@id='uriTemplate']")).sendKeys("https://api.linkedin.com/v1/people/~:(id,num-connections,picture-url)?format=json");
        
        
       Thread.sleep(2000);
       dr.findElement(By.xpath(".//*[@id='buttonRow']/table/tbody/tr/td/input[1]")).click();
        
     
       
	}

}
