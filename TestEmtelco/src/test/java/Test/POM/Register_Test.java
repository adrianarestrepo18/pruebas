package Test.POM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Test {
	
	private static final By EmailaddresLocator = null;
	private WebDriver driver;
	RegisterPage registerPage;

	@Before
	public void setUp() throws Exception {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConnetion();
		registerPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
		
	}

	@Test
	public void registerUser() throws InterruptedException {
		By registerLinkLocator = null;
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(1000);
		if(driver.findElement(registerLinkLocator).isDisplayed()) {
			driver.findElement(EmailaddresLocator).sendKeys("comprasdprueba1@hotmail.com");
			By registerBtnLocator = null;
			driver.findElement(registerBtnLocator).click();
			By homePageLocator = null;
			assertTrue(driver.findElement(homePageLocator).isDisplayed());

	}
		else {
			System.out.print("Register pages was not found");
		}
		
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		String pageHeading = driver.findElement(By.className("page-heading")).getText();
		System.out.println("Page Heading: "+pageHeading);
	}


 {

}

 
}





	
		
	