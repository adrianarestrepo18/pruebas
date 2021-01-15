package AdrianaTest;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewexperienceTest {
	
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.xpath("authentication");
	By registerBtnLocator = By.name("SubmitCreate");
	
	By EmailaddresLocator = By.id("email_create");


    

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerLinkLocator).isDisplayed()) {
			driver.findElement(EmailaddresLocator).sendKeys("juanpa@hotmail.com");
			driver.findElement(registerBtnLocator).click();
	

			
	
	}
		else {
			System.out.print("Register pages was not found");
		}
		
		

}

}