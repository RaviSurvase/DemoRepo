package step_defination;

import browse_setup.BrowserSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EnterData;
import utils.ReadPropeties;

public class AlertHandling {


    WebDriver driver;

    ReadPropeties rp=new ReadPropeties();
    BrowserSetUp bs = new BrowserSetUp();

@Given("I am in the Test Website")
public void i_am_in_the_test_website() throws Exception {
    driver = bs.browserSetUp("chrome");
    driver.get(rp.ReadProperty("./src/main/resources/config.properties", "url1"));
    driver.manage().window().maximize();

}

@When("I enter the text in side the text box")
public void i_enter_the_text_in_side_the_text_box() {



//    System.out.println("Title of the current page : "+driver.getTitle());
    EnterData search = new EnterData(driver);
    search.enterKeyword("abc");

}

@Then("handle the alert")
public void handle_the_alert() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println(driver.getTitle());
	
	driver.quit();
//    throw new io.cucumber.java.PendingException();
}




}
