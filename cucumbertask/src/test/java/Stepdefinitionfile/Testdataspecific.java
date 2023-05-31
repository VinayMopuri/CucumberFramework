package Stepdefinitionfile;

import java.util.List;

import io.cucumber.java.da.Givet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testdataspecific {

@Givet("user navigate to login page")
public void user_navigate_to_login_page() {
    System.out.println("user navigate to login page");
}

@When("user enters the following details")
public void user_enters_the_following_details(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> data=dataTable.asLists(String.class);
	for(List<String>l:data) {
		System.out.println(l);
		
	}
}

@When("clicks on login button")
public void clicks_on_login_button() {
	System.out.println("clicks on login button");
}

@Then("user should get login scucess")
public void user_should_get_login_scucess() {
	System.out.println("user should get login scucess");
}


}
