package tests;

import browse_setup.BrowserSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pages.EnterData;
import utils.ReadPropeties;
import utils.ReadXlFiles;

import java.io.IOException;

public class TestWebsite {
    WebDriver driver;
    ReadPropeties rp = new ReadPropeties();
    BrowserSetUp bs = new BrowserSetUp();

    @DataProvider(name="DataFromXLSheetByUsingDataProvider")
    public Object[][] createData1() throws IOException {
        ReadXlFiles readXlFiles = new ReadXlFiles();
        Object[][] data = readXlFiles.readXlData("src/main/resources/TestDataFile.xlsx", "Sheet1");
        return data;
    }


    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) throws Exception {


//        driver = bs.browserSetUp(browser);
//        driver.get(rp.ReadProperty("./src/main/resources/config.properties", "url1"));
//        driver.manage().window().maximize();
    }

    @Test(dataProvider = "DataFromXLSheetByUsingDataProvider")
    public void FirstTestCase(String keyword) throws IOException {
//        System.out.println("Title of the current page : "+driver.getTitle());
//        EnterData search = new EnterData(driver);
//        search.enterKeyword(keyword);

    }




    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(400);
        bs.closeDriver();
    }
}
