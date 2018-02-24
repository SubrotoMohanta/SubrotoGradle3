import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
	
	@Test
	public void getGoogleMethod() {
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.co.in");
		}
	}

}
