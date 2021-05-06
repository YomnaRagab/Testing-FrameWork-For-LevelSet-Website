package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CreatADocumentPage;
import webactions.WebActions;

public class Base {
    private WebDriver driver;
    private String baseURL = "https://www.levelset.com/";
    By creatDocumentField = new By.ByXPath("//a[@class=\"btn btn-info btn-outline mob-dropdown-btn\"]");
    private WebActions webactions;
    public Base(WebDriver driver){
        this.driver=driver;
        webactions = new WebActions(driver);
    }
    public void navigateToHomePage(){
        driver.get(baseURL); // go to home page
        webactions.waitUntil(By.id("page-wrap"), WebActions.action_enum.visible);
    }
    public CreatADocumentPage navigateToCreatDoc(){
        driver.findElement(creatDocumentField).click();
        webactions.waitUntil(By.id("document_search"), WebActions.action_enum.visible);
        return new CreatADocumentPage(driver);

    }
}
