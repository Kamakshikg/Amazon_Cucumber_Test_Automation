package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.HomePage;
import tests.BaseTest;

public class SearchSteps extends BaseTest
{	
	@Given("user is on home page")
	public void user_is_on_home_page() 
	{
		System.out.println("Inside Step - User is on Home Page");
		super.setup("chrome", "https://www.amazon.in");
	}

	@When("user enter {string} in search box")
	public void user_enter_mobile_phones_in_search_box(String product_name) 
	{
		System.out.println("Inside Step - User enters the product name in search box");
		home_page.set_search_box(product_name);
	}

	@And("clicks on search button")
	public void clicks_on_search_button() 
	{
		System.out.println("Inside Step - User clicks the search button");
		home_page.click_search_button();
	}

	@Then("user gets redirected to the searched product page")
	public void user_gets_redirected_to_the_searched_product_page() 
	{
		System.out.println("Inside Step - User gets redirected to the products page");
		driver.getPageSource().contains("Mobile Phones");
	}
	
	@When("user clicks on select your location")
	public void user_clicks_on_select_your_location() 
	{
		System.out.println("Inside Step - User clicks on select your location");
	    home_page.click_select_location_text();
	}

	@And("user enters {string} in textbox")
	public void user_enters_in_textbox(String pin_number) 
	{
		System.out.println("Inside Step - User enters pin number in textbox");
		home_page.enter_pin_number(pin_number);
	}

	@And("clicks on Apply button")
	public void clicks_on_apply_button() 
	{
		System.out.println("Inside Step - User clicks on apply button");
		home_page.click_apply_button();
	}

	@Then("location is visible as text in header")
	public void location_is_visible_as_text_in_header() 
	{
		if(home_page.check_location_displayed()==true)
		{
			System.out.println("Inside Step - Location is visible as text in header");
		}
	}
}
