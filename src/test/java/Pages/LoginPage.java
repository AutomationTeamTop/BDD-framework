package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class LoginPage extends BasePage {

    By email_field=By.cssSelector("input[name='username']");
    By password_field=By.cssSelector("input[name='password']");
    By login_button=By.cssSelector(".button");
    By invalid_message=By.cssSelector("p.oxd-text.oxd-text--p.oxd-alert-content-text");
    By logo_page=By.cssSelector("div.orangehrm-login-branding");
    
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public DashboardPage SetLoginCredentials(String username,String password){
		driver.findElement(email_field).sendKeys(username);
		driver.findElement(password_field).sendKeys(password+ Keys.ENTER);
		return new DashboardPage(driver);
	}
	
	
	
	
	public boolean VerifyLogo() {
		return driver.findElement(logo_page).isDisplayed();
	}
	
	public String getErrorMessage() {
		String error_mess=driver.findElement(invalid_message).getText();
		return error_mess;
		
	}
	
	
	

}
