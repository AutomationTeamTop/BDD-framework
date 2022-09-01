package stepDefinitions;


import org.testng.Assert;

import Pages.DashboardPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;


public class LoginSteps extends BaseTest {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	@Given("Login page is loaded")
	public void login_page_is_loaded() {
		loginPage=new LoginPage(driver);  
	}
	
	@When("user enter username {string} and Password {string}")
	public void user_enter_valid_username_and_password(String user,String password) {
	   dashboardPage=loginPage.SetLoginCredentials(user, password);
	}
	
	@Then("user is navigated to the dashboard page")
	public void user_is_navigated_to_the_dashboard_page() {
		String expPageHeaderTitle="Dashboard";
    	String actPageHeaderTitle=dashboardPage.getPageHeader();
    	Assert.assertEquals(expPageHeaderTitle,actPageHeaderTitle,"logged in successfully");
	}
		

}
