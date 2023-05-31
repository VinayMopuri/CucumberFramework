package Stepdefinitionfile;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orangehrm {

	WebDriver driver;
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
	    System.out.println("User navigates to Login Page");
//	    ChromeOptions option=new ChromeOptions();
//	    option.addArguments("--remote-allow-origins=*");
//	    WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver(option);
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	//Thread.sleep(1000);
	}

	@When("Enter Valid Username (.+)$")
	public void enter_valid_username_vinaymopuri13_gmail_com(String user) {
		System.out.println("Enter Valid Username"+user);
	}

	@When("Enter Valid Password (.+)$")
	public void enter_valid_password_vinay(String pass) {
		System.out.println("Enter Valid Password"+pass);
	}

	@When("clcik on Login button")
	public void clcik_on_login_button() {
		System.out.println("clcik on Login button");
	}
	@Then("User should login Scuccessfully")
	public void user_should_login_scuccessfully() {
	System.out.println("User should login Scuccessfully");
	}

	@When("Enter Valid Username")
	public void enter_valid_username_vinaymopuri134_gmail_com() {
		System.out.println("Enter Valid Username");
	}

}
