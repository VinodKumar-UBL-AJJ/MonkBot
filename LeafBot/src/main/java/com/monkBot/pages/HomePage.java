package com.monkBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.monkBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
public HomePage (RemoteWebDriver driver, ExtentTest test, ExtentTest node) {
	
	this.driver= driver;
	this.node= node;
	this.test=test;
	PageFactory.initElements(driver, this);
}



}
