package browse_setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSetUp {
    WebDriver driver;

    public WebDriver browserSetUp(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Invalid Browser");
        }
        return driver;
    }

    public void closeDriver(){
        driver.quit();
    }
}
