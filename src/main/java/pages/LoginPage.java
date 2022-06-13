package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class LoginPage extends ProjectSpecificWrappers{

	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
        this.driver =driver;
        this.test=test;
        
        if(!verifyTitle("ToolsQA")) {
        	reportStep("The page verification failed","Fail");
        }
   }
	
	public LoginPage enterUserName(String UN) {
		enterById("userName",UN);
		return this;
	}
	
	public LoginPage enterPassword(String PW) {
		enterById("password", PW);
		return this;
	}
	
	public ProfilePage clickLogin() {
		clickById("login");
		return new ProfilePage(driver,test);
	}
	
	public RegisterPage clickNewUser() {
		clickById("newUser");
		return new RegisterPage(driver, test);
	}
}
