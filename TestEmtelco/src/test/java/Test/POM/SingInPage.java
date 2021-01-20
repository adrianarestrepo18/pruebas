package Test.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends Base{
	
	  
	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.xpath("authentication");
	By registerBtnLocator = By.name("SubmitCreate");
	By EmailaddresLocator = By.id("email_create");
	By homePageLocator = By.className("page-heading");
	By homePageSearch = By.className("search_query");
	By registerBtnSearch = By.name("submit_search");
	
	By passwdLocator = By.id("passwd");
	

	public SingInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void singIn() {
		if(isDisplayed(registerPageLocator)) {
			type("adrianarestrepo18@gmail.com",EmailaddresLocator);
			By passwordLocator = null;
			type("Adri3218",passwordLocator);
			click(registerBtnLocator);
			
			
			click (registerBtnLocator);
		}else {
			
			System.out.println("Register pages was not found");
			
		}
		
	}

	public boolean inHomePageDisplayed() {
		return isDisplayed(homePageLocator); 
	}
}
