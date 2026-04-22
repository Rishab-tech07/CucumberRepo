package stepsdefinitions;

import Page.BasePage;
import Page.HomePage;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class PetStoreSteps {



   BasePage base = new BasePage();
   
   HomePage home=new HomePage();	

   LoginPage login = new LoginPage();
   
   @Given("user launches application")
   public void user_launches_application() {
       // Write code here that turns the phrase above into concrete actions
	   base.LandingPage();

   }

   @When("user enters store")
   public void user_enters_store() {
       // Write code here that turns the phrase above into concrete actions
       home.clickEnterStore();
   }

   @Then("user verifies the title of WebPage")
   public void user_verifies_the_title_of_web_page() {
       // Write code here that turns the phrase above into concrete actions
       home.verifyTitle();
   }
   
   @Then("User Login In Its Account")
   public void user_login_in_its_account() {
       // Write code here that turns the phrase above into concrete actions
       login.clickSignIn();
       login.login("2478573","12345");
   }
   
   @Then("user verfies its Account")
   public void user_verfies_its_account() {
       // Write code here that turns the phrase above into concrete actions
       login.verifyAccount();
   }


}