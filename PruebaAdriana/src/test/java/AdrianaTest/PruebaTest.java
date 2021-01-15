package AdrianaTest;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	
	@Test
	public void testPruebasChoucairTest() {
	
		WebElement searchbox = driver.findElement(By.name("login"));
		
		searchbox.clear();
		
		searchbox.sendKeys("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account - Google Search", driver.getTitle());
	
	
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
		
		
	}

}