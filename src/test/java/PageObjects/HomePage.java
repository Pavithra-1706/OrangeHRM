package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage{
		
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
	
    this.driver=driver;
	PageFactory.initElements(driver, this);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}	   
		@FindBy(xpath="//*[@placeholder='Username']") WebElement txt_username;
		@FindBy(xpath="//*[@placeholder='Password']") WebElement txt_Password;
		@FindBy(xpath="//*[@type='submit']") WebElement btn_submit;
		
		public void username(String username) {
			txt_username.sendKeys(username);
		}
		
		public void password(String password) {
			txt_Password.sendKeys(password);
		}
		
		public void submit()
		{
			btn_submit.click();
		}
	

}
		
