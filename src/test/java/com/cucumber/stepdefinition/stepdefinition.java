package com.cucumber.stepdefinition;


import java.util.concurrent.TimeUnit;

import com.cucumber.Baseclass.Insta_Baseclass;
import com.cucumber.POM.NewAccount;

import cucumber.api.java.en.Then;

public class stepdefinition extends Insta_Baseclass {

@Then("^user should verify logo$")
public void user_should_verify_logo() throws Throwable {
	NewAccount a=new NewAccount(driver);
	elementisDisplayed(a.getLogo());
	
	
}

@Then("^user enter the mail_id$")
public void user_enter_the_mail_id() throws Throwable {
	NewAccount n=new NewAccount(driver);
	sendkeys(n.getEmail(),"demo123@gmail.com");
}

@Then("^user enter the fullname$")
public void user_enter_the_fullname() throws Throwable {
	NewAccount n=new NewAccount(driver);
	sendkeys(n.getFullname(), "xyzzzzzz");
}

@Then("^user enter the username$")
public void user_enter_the_username() throws Throwable {
	NewAccount n=new NewAccount(driver);
	sendkeys(n.getUsername(),"admin_user");
}

@Then("^user enter the password$")
public void user_enter_the_password() throws Throwable {
	NewAccount n=new NewAccount(driver);
	sendkeys(n.getPassword(), "password@123");
}

@Then("^user click the sigup button$")
public void user_click_the_sigup_button() throws Throwable {
	NewAccount n=new NewAccount(driver);
	clickelement(n.getSubmit());
}


}
