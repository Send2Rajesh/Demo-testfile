package com.cucumber.POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
public WebDriver driver;

@FindBy(xpath="//input[@aria-label='Mobile Number or Email']")
private WebElement email;
public WebElement getEmail() {
	return email;
}
public WebElement getFullname() {
	return fullname;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSubmit() {
	return submit;
}
@FindBy(xpath="//input[@aria-label='Full Name']")
private WebElement fullname;
@FindBy(xpath="//input[@aria-label='Username']")
private WebElement username;
@FindBy(xpath="//input[@aria-label='Password']")
private WebElement password;
@FindBy(xpath="//button[@type='submit']")
private WebElement submit;
@FindBy(xpath="//h1[@class='NXVPg Szr5J  coreSpriteLoggedOutWordmark']")
private WebElement logo;
public WebElement getLogo() {
	return logo;
}
public NewAccount(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
}
