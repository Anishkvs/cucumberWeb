package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {

    @Given("^User is on Netbanking login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
        System.out.println("Navigate to login page");
    }

    @When("^User enter into application with username and password$")
    public void user_enter_into_application_with_username_and_password() throws Throwable {
    	 System.out.println("user enter username and password");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	 System.out.println("Navigate to Home page");
    }

    @And("^Card is displayed$")
    public void card_is_displayed()
    {
    	 System.out.println("Card is viewed");
      
    }

}

