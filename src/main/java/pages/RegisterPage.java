package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class RegisterPage extends ProjectSpecificWrappers{
	
	public RegisterPage(RemoteWebDriver driver, ExtentTest test) {
        this.driver =driver;
        this.test=test;
        
        if(!verifyTitle("ToolsQA")) {
        	reportStep("The page verification failed","Fail");
        }
   }
	
	

}
