package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import Page.BasePage;

public class Hooks extends BasePage {

    @Before
    public void setUp() {
     
    }

    @After
    public void tearDownScenario() throws InterruptedException {
        tearDown(); 
    }
}