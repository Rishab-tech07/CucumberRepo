package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    protected static WebDriver driver;

    public void LandingPage() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://petstore.octoperf.com/");
        }
    }

    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(5000);
            driver.quit();
            driver = null;
        }
    }
}