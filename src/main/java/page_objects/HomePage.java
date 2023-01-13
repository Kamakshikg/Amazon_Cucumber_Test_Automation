package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	///////////////// Navigate to Home Page //////////////
	
//	public void navigate_to_home_page(String url)
//	{
//		driver.navigate().to(url);
//	}
	
	
	///////////////// Search products////////////////
	
	// Locate the elements
	@FindBy(how=How.XPATH,using="//*[@id=\"twotabsearchtextbox\"]")
	private WebElement search_box;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-search-submit-button\"]")
	private WebElement search_button;
	
	// Enter product name in search box.
	public void set_search_box(String product_name)
	{
		search_box.sendKeys(product_name);
	}
	
	// Click on search button.
	public void click_search_button()
	{
		search_button.click();
	}
	
	///////////////// Location Detection ///////////////
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-global-location-popover-link\"]")
	private WebElement select_location_text;
	
	@FindBy(how=How.CSS,using="#a-popover-header-1")
	private WebElement location_pop_up;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"GLUXZipUpdateInput\"]")
	private WebElement pin_number_textbox;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"GLUXZipUpdate\"]/span/input")
	private WebElement apply_button;
	
	@FindBy(how=How.CSS,using="#glow-ingress-line2")
	private WebElement display_location_text;
	
	public void click_select_location_text()
	{
		select_location_text.click();
	}
	
	public void check_popup_window()
	{
		driver.switchTo().frame(location_pop_up);
	}
	
	public void enter_pin_number(String pin_number)
	{
		pin_number_textbox.sendKeys(pin_number);
	}
	
	public void click_apply_button()
	{
		apply_button.click();
	}
	
	public Boolean check_location_displayed()
	{
		return display_location_text.isDisplayed();
	}
}
