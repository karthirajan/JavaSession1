package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.telecom.resources.Commonactions;

public class AddCustomerPage extends Commonactions{
	
	public AddCustomerPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement customerButton;
	
	@FindBy(xpath = "//label[@for='done']")
	private WebElement doneButton;
	
	@FindBy(id = "fname")
	private WebElement firstName;
	
	@FindBy(id = "lname")
	private WebElement lastName;
	
	@FindBy(id = "email")
	private WebElement mail;
	
	@FindBy(name = "addr")
	private WebElement address;
	
	@FindBy(id = "telephoneno")
	private WebElement phno;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitButton;
	
	@FindBys({
			@FindBy(id="message"),
			@FindBy(name ="addr")
	})
	private WebElement address1;
	
	@FindAll({
		@FindBy(id="message"),
		@FindBy(name ="addr")
    })
   private WebElement address2;

	public WebElement getCustomerButton() {
		return customerButton;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	

}
