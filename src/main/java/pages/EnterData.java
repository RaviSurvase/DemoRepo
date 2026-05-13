package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterData {
    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public EnterData(WebDriver driver) {
        this.driver = driver;
//        PageFactory
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    WebElement name;


    public void enterKeyword(String str) {
        name.sendKeys(str);
    }
}
