package Page;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;



public class LoginPage extends BasePage {



   By signIn = By.linkText("Sign In");

   By username = By.name("username");

   By password = By.name("password");

   By loginBtn = By.name("signon");

   By verifylogin=By.id("WelcomeContent");
   public void clickSignIn() {

       driver.findElement(signIn).click();
       
   }



   public void login(String user, String pass) {

       driver.findElement(username).sendKeys(user);

       driver.findElement(password).clear();

       driver.findElement(password).sendKeys(pass);

       driver.findElement(loginBtn).click();

   }
   
   public void verifyAccount() {
	   
	   String wel=driver.findElement(verifylogin).getText();
	   
	   assertEquals("Welcome Rish!",wel);
   }

}