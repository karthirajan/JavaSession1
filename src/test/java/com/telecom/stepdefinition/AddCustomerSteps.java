package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	AddCustomerPage ap = new AddCustomerPage();
	
	@Given("user launches demo telecom application")
	public void user_launches_demo_telecom_application() {
	   
		
		
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		
		ca.button(ap.getCustomerButton());
		
		
	    
	}

	@When("user enters all the fields")
	public void user_enters_all_the_fields() {
		
		
		
		ca.button(ap.getDoneButton());
		ca.insertText(ap.getFirstName(), "karthi");
		ca.insertText(ap.getLastName(), "rajan");
		ca.insertText(ap.getMail(), "rajan@gmail.com");
		ca.insertText(ap.getAddress(), "tanjore");
		ca.insertText(ap.getPhno(), "75764654353");
		
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		ca.button(ap.getSubmitButton());
	    
		
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	    
	}
	
	@When("user enters all the fields by one dim list concep")
	public void user_enters_all_the_fields_by_one_dim_list_concep(DataTable dataTable) {
	    
		
		List<String> datas = dataTable.asList(String.class);
		ca.button(ap.getDoneButton());
		ca.insertText(ap.getFirstName(), datas.get(0));
		ca.insertText(ap.getLastName(), datas.get(1));
		ca.insertText(ap.getMail(), datas.get(2));
		ca.insertText(ap.getAddress(), datas.get(3));
		ca.insertText(ap.getPhno(), datas.get(4));
		
	}
	
	@When("user enters all the fields by one dim map concept")
	public void user_enters_all_the_fields_by_one_dim_map_concept(DataTable dataTable) {
	    
		
		Map<String,String> datas = dataTable.asMap(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
		driver.findElement(By.id("email")).sendKeys(datas.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(datas.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phno"));
		
	}
	
	@When("user enters all the fields by two dim list concept")
	public void user_enters_all_the_fields_by_two_dim_list_concept(DataTable dataTable) {
	    
		
		List<List<String>> datas = dataTable.asLists(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(2).get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(3).get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(2).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(3).get(4));
		
	}
	
	@When("user enters all the fields by two dim map concept")
	public void user_enters_all_the_fields_by_two_dim_map_concept(DataTable dataTable) {
	    
		
		List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(1).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(datas.get(3).get("mail"));
		driver.findElement(By.name("addr")).sendKeys(datas.get(2).get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(3).get("phno"));
		
	}
	
	@When("user enters all the fields {string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields(String fname, String lna, String string3, String string4, String string5) {
	    
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lna);
		driver.findElement(By.id("email")).sendKeys(string3);
		driver.findElement(By.name("addr")).sendKeys(string4);
		driver.findElement(By.id("telephoneno")).sendKeys(string5);
		
	}


}
