package basetests;

import base.Base;
import browseractions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webactions.WebActions;

public class BaseTests {
    //private WebDriver driver ;
    protected Base home ;
    protected WebDriverWait wait;
    protected WebActions webactions;


    @BeforeClass
    public void setUp(){

        BrowserActions.initializeWebDriver(BrowserActions.webddriver_enum.chrome);
        wait=new WebDriverWait(BrowserActions.driver, 40);
        home = new Base(BrowserActions.driver);
        webactions =  new WebActions(BrowserActions.driver);
    }
    @AfterClass
    public void tearDown(){
        BrowserActions.closeDriver();
    }
}
