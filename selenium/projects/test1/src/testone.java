import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testone {

	public static void main(String[] args) {
		WebDriver dr =  new FirefoxDriver();
		
		dr.get("https://www.google.lk/");

	}

}
