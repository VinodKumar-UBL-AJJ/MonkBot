package com.monkBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.monkBot.testng.api.base.ProjectSpecificMethods;

public class loginPage extends ProjectSpecificMethods {

	public loginPage(RemoteWebDriver driver, ExtentTest test, ExtentTest node) {
		this.driver= driver;
		this.node= node;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(how=How.ID, using="txtUsername")	
WebElement uname;	
	
public loginPage enterUsername(String username) {
	clearAndType(uname, username);
	return this;
}

@FindBy(how=How.ID, using="txtPassword")
WebElement pword;
public loginPage enterPassword(String password) {
	clearAndType(pword, password);
	return this;
}

@FindBy(how=How.ID, using="btnLogin")
WebElement submit;
public HomePage clickLoginButton() {
	click(submit);
	
	return new HomePage(driver, test, node);
}

}
