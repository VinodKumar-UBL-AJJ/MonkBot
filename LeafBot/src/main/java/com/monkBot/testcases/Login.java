package com.monkBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.monkBot.pages.loginPage;
import com.monkBot.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login function";
		testDescription = "Login testCase using valid credentials";
		nodes = "Leads";
		authors = "Vinod";
		category = "Functionality";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void loginFunction(String username, String password) {
		
		new loginPage(driver, test, node).enterUsername(username).enterPassword(password).clickLoginButton();
	}


}





