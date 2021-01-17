package AdrianaTest;



import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class NewexperienceTest {
	
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.xpath("authentication");
	By registerBtnLocator = By.name("SubmitCreate");
	By EmailaddresLocator = By.id("email_create");
	By homePageLocator = By.className("page-heading");
	
	By passwdLocator = By.id("passwd");
	

    
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
		Thread.sleep(1000);
		if(driver.findElement(registerLinkLocator).isDisplayed()) {
			driver.findElement(EmailaddresLocator).sendKeys("prueba999@hotmail.com");
			driver.findElement(registerBtnLocator).click();
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
		
		
		//Seleccione Genero y datos personales
		
		driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Adriana");
		driver.findElement(By.name("customer_lastname")).sendKeys("Restrepo");
		driver.findElement(By.name("passwd")).sendKeys("Nana123");
		
		
		WebElement eleState = driver.findElement(By.name("id_state"));
		Select selectState = new Select(eleState);
		selectState.selectByVisibleText("Texas");
		
		WebElement eleDays = driver.findElement(By.name("days"));
		Select selectDays = new Select(eleDays);
		selectDays.selectByValue("18");
		
		WebElement elemonths = driver.findElement(By.name("months"));
		Select selectmonths = new Select(elemonths);
		selectmonths.selectByValue("7");
		
		WebElement eleyears = driver.findElement(By.name("years"));
		Select selectyears = new Select(eleyears);
		selectyears.selectByValue("1982");
		
		 // Ingresamos dirección

		  driver.findElement(By.id("firstname"));
		  driver.findElement(By.id("lastname"));
		  driver.findElement(By.id("company")).sendKeys("Pruebas");
		  driver.findElement(By.id("address1")).sendKeys("Calle 01 # 01-21");
		  driver.findElement(By.id("city")).sendKeys("Medellin");
		  driver.findElement(By.id("address2")).sendKeys("Dirección Opcional");
		  
		  driver.findElement(By.name("postcode")).sendKeys("05897");
		  
		 // Selecionamos Pais
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
		  
		  // Otra informacion
		  
		  
		  driver.findElement(By.id("other")).sendKeys("Campo de pruebas xxxxxx xxxxxx");
		  
		  //Ingresamos el numero telefonico 
		  driver.findElement(By.id("phone_mobile")).sendKeys("300689755");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Pruebas");
		  driver.findElement(By.name("submitAccount")).click();
		  String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
		  

		  // Validamos usuario que fue creado
		  if(userText.contains("Vsoft")) {
		   System.out.println("User Verified,Test case Passed");
		  }
		  else {
		   System.out.println("User Verification Failed,Test case Failed");
		  }
		  

		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";
		  
		  // Open URL and Maximize browser window
		  driver.get(URL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  //Login
		  driver.findElement(By.id("email")).sendKeys("adrianarestrepo18@gmail.com");
		  driver.findElement(By.id("passwd")).sendKeys("Adri3218");
		  driver.findElement(By.id("SubmitLogin")).click();
		  
		  //Click on Women
		  driver.findElement(By.linkText("WOMEN")).click();
		  
		  WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		  WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		  Actions actions=new Actions(driver);
		  actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();
		  
		  
		 //Cambiar cantidad x 2
		  driver.findElement(By.id("quantity_wanted")).clear();
		  driver.findElement(By.id("quantity_wanted")).sendKeys("2");

		  //Seleccionar la talla M
		  WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id='group_1']"));
		  Select oSelect=new Select(Sizedrpdwn);
		  oSelect.selectByVisibleText("M");

		  //Seleccionar el Color
		  driver.findElement(By.id("color_11")).click();

		  //Click agregar al carrito
		  driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

		  //Click para proceder
		  driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		  
		  //Checkout page Proceed
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  
		  //Agrega terminos y condiciones
		  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

		  //Click on Payby Check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  
		  //Confirmar la order
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

		  //Get Text
		  String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();
		  
		  // Verifica si el producto esta ordenado
		  if(ConfirmationText.contains("complete")) {
		   System.out.println("Order Completed: Test Case Passed");
		  }
		  else {
		   System.out.println("Order Not Successfull: Test Case Failed");
		  }

		 }
  
	}