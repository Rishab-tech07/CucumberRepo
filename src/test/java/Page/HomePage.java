package Page;



import org.openqa.selenium.By;



public class HomePage extends BasePage {



   By enterStoreBtn = By.linkText("Enter the Store");


   public void clickEnterStore() {

       driver.findElement(enterStoreBtn).click();

   }
   
   public String verifyTitle()

	    {

	    	  String actualTitle =  driver.getTitle();

	    	  return actualTitle;

	    }

}