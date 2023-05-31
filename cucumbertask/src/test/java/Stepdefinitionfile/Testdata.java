package Stepdefinitionfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdata {
	
	
	
	
	@Before
	public void open() {
		
		System.out.println("Browser got Opened");
	}
	@After
	public void tearDown() {
		
		System.out.println("Browser got Closed");
	}
	@BeforeStep
	public void Bstep() {
		
		System.out.println("Before the step");
	}
	@AfterStep
	public void Astep() {
		
		System.out.println("After the Step");
	}
	WebDriver driver;
	
	
	@Given("open the login funcitionality of application")
	public void open_the_login_funcitionality_of_application() throws InterruptedException {
		System.out.println("Step1:open the url of orangehrm application");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	//Thread.sleep(1000);

	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		//driver.findElement(By.id("username")).sendKeys("Admin");
		//driver.findElement(By.id("password")).sendKeys("admin123");
		System.out.println("Step2:user enters the username and password");
	
	}

	@And("Click on the sign in button")
	public void click_on_the_sign_in_button() {
		System.out.println("Step3:Click on the sign in button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	}
	@Then("click on dashboard")
	public void click_on_dashboard() {
		System.out.println("------------Click on dashboard------------------");
		WebElement dashboard = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
		dashboard.click();
	}
//
//	@Then("click on search")
//	public void click_on_search() {
//		System.out.println("------------Search Bar------------------");
//		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		search.click();
//
//	}

	@Then("Click on Admin")
	public void Click_on_Admin() {
		System.out.println("Click on Admin");
		WebElement ele = driver.findElement(By.xpath("//a[@href ='/web/index.php/admin/viewAdminModule']"));
	ele.click();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='/web/index.php/admin/viewAdminModule']")));
	}

	@Then("Click on User management")
	public void click_on_user_management() {
		System.out.println("Click on User management");
		driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();
	   
	}

	@And("Click on Users")
	public void click_on_users() {
		System.out.println("Click on Users");
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li")).click();
	}


	@Then("Click on Nationalities")
	public void click_on_nationalities() {
		System.out.println("Click on Nationalities");
		driver.findElement(By.xpath("//a[normalize-space()='Nationalities']")).click();
	}
	
	@Then("logout the Application")
	public void logout_the_application() throws InterruptedException {
		System.out.println("Step4:logout the Aspplication");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
	}
	
	}
	

