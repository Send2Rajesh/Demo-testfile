package com.cucumber.Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Baseclass.Insta_Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucumber\\feature",glue="com.cucumber.stepdefinition")
public class Testrunner {
	public static WebDriver driver;
	@BeforeClass
	public static void launcher() throws Throwable {
	driver=	Insta_Baseclass.browserlaunch("chrome");
	Insta_Baseclass.geturl("https://www.instagram.com/");
		
	}
	@AfterClass
	public static void quit() {
driver.quit();
	}

}
