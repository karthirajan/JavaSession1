
package com.telecom.stepdefinition;



import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffPlanSteps {
	static WebDriver driver;
	@Given("user launch demo telecom webpages")
	public void user_launch_demo_telecom_webpages() {
		 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("http://www.demo.guru99.com/telecom/");
		   driver.manage().window();
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   }
	@Given("user click on addtarficplan button")
	public void user_click_on_addtarficplan_button() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
	    
	}
	@When("user click the all fileds")
	public void user_click_the_all_fileds() {
		driver.findElement(By.name("rental")).sendKeys("1");
		driver.findElement(By.name("local_minutes")).sendKeys("1");
		driver.findElement(By.id("inter_minutes")).sendKeys("2");
		driver.findElement(By.name("sms_pack")).sendKeys("1");
		driver.findElement(By.name("minutes_charges")).sendKeys("1");
		driver.findElement(By.name("inter_charges")).sendKeys("2");
		driver.findElement(By.id("sms_charges")).sendKeys("1");
	}

	@When("user click the submit butto")
	public void user_click_the_submit_butto() {
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
	    
	}

	@Then("user verify Congratulations is generte")
	public void user_verify_Congratulations_is_generte() {
		WebElement congrats  = driver.findElement(By.xpath("//*[text()='Congratulation you add Tariff Plan']"));
		 String equal = congrats.getText();
		    Assert.assertEquals(equal, "Congratulation you add Tariff Plan");
		    System.out.println("Congratulation you add Tariff Plan");
		
	   
	}
	@When("user click the all fileds by using one dim list")
	public void user_click_the_all_fileds_by_using_one_dim_list(DataTable dataTable) {
		List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.name("rental")).sendKeys(datas.get(0));
		driver.findElement(By.name("local_minutes")).sendKeys(datas.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(datas.get(3));
		driver.findElement(By.name("minutes_charges")).sendKeys(datas.get(4));
		driver.findElement(By.name("inter_charges")).sendKeys(datas.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(6));
	}
	@When("user click the all fileds by using one dim map")
	public void user_click_the_all_fileds_by_using_one_dim_map(DataTable dataTable) {
	   Map<String,String> datas = dataTable.asMap(String.class,String.class);
		driver.findElement(By.name("rental")).sendKeys(datas.get("rental"));
		driver.findElement(By.name("local_minutes")).sendKeys(datas.get("local_minutes"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get("inter_minutes"));
		driver.findElement(By.name("sms_pack")).sendKeys(datas.get("sms_pac"));
		driver.findElement(By.name("minutes_charges")).sendKeys(datas.get("minutes_charges"));
		driver.findElement(By.name("inter_charges")).sendKeys(datas.get("inter_charges"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get("sms_charges"));


	}
}