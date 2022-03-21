package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
	
    private WebDriver driver;

    @Before
    public void createDriver() {
    	System.setProperty("webdriver.chrome.driver","c:\\Users\\chromedriver.exe");
        driver = new ChromeDriver();
    }     

    
	
	@Given("Megnyitom a weboldalt")
	public void megnyitom_a_weboldalt() {
	    driver.get("https://gvkdev.mav.hu");
	    
		
	}

	@Then("Megkapom a titelt sikeresen")
	public void megkapom_a_titelt_sikeresen() {
	    
		driver.getTitle();
	}
	
	@After()  public void killdriver()
	
	{
		
		driver.quit();
	}

}
