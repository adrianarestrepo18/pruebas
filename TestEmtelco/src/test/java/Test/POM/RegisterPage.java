package Test.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class RegisterPage extends Base {
	
	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.xpath("authentication");
	By registerBtnLocator = By.name("SubmitCreate");
	By EmailaddresLocator = By.id("email_create");
	By homePageLocator = By.className("page-heading");
	By homePageSearch = By.className("search_query");
	By registerBtnSearch = By.name("submit_search");
	By passwdLocator = By.id("passwd");
	
	
	By registeredMessage = By.tagName("font");

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void  registerUser() throws InterruptedException {
		click(registerLinkLocator);	
		Thread.sleep(2000);
		if(isDisplayed(registerPageLocator)) {
			type("adrianarestrepo18@gmail.com",EmailaddresLocator);
			By passwordLocator = null;
			type("Adri3218",passwordLocator);
			
		
			click (registerBtnLocator);
		}else {
			
			System.out.println("Register pages was not found");
		}
	}
	
	
	public String registeredMessage() {
		
		
		List<WebElement> fonts = findElements(registeredMessage);
		return getText(fonts.get(5));
		
	}

}
