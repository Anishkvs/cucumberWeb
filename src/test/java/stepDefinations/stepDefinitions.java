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

    @When("^User enter into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	 System.out.println("Navigate to Home page");
    }
    
    
    @And("^Card displayed is \"([^\"]*)\"$")
    public void card_displayed_is_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }
    
    
   
}

