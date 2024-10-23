package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class TC001_Login{

	static WebDriver driver;
	
	@BeforeClass
	public void setup() {
				
	    driver=new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test
	public static void LoginValidation() {
		
		HomePage perform=new HomePage(driver);
		perform.username("Admin");
		perform.password("admin123");
		perform.submit();
				
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
