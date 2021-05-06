package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webactions.WebActions;

public class CreatADocumentPage {
    private WebDriver driver;
    private WebActions webactions;

    private String tabBaseField = "//div[contains(@class, 'sc-AxjAm bcMPWx') and contains(.//div, '%s')]";
    private String priceBaseField = "//div[contains(@class,'sc-AxjAm bcMPWx') and contains(., '%s') ]/descendant::span[contains(text(),'Free')]";
    private String preliminaryNoticeString= "20-Day Preliminary Notice";
    private String intentToLienString ="Notice of Intent to Lien";
    private String bondClaimString ="Lien / Bond Claim";
    private String lienWaiverString = "Lien Waiver";
    private String headerString = "title";
    private By headerField = new By.ByClassName(headerString);

    public CreatADocumentPage(WebDriver driver){
        this.driver=driver;
        webactions = new WebActions(driver);
    }

        /*Preliminary Tab*/

//check click
    public void clickOnPreliminaryNotice(){
            webactions.clickOn(generateTabXPath(tabBaseField,preliminaryNoticeString));
            //driver.findElement(generateTabXPath(tabBaseField,preliminaryNoticeString)).click();
        }
        public String findHeaderOfPreliminaryNotice(){
            return driver.findElement(headerField).getText();
        }
        public String findPriceOfPreliminaryNotice(){
            return webactions.getText(generateTabXPath(priceBaseField,preliminaryNoticeString));
        }

    /*Intent To Lien Tab*/

    public void clickOnIntentToLien(){
        driver.findElement(generateTabXPath(tabBaseField,intentToLienString)).click();
    }
    public String findHeaderOfIntentToLien(){
        return driver.findElement(headerField).getText();
    }
    public String findPriceOfIntentToLien(){
        return webactions.getText(generateTabXPath(priceBaseField,intentToLienString));
    }

    /*Lien / Bond Claim Tab*/

    public void clickOnBondClaim(){
        driver.findElement(generateTabXPath(tabBaseField,bondClaimString)).click();
    }
    public String findHeaderOfBondClaim(){
        return driver.findElement(headerField).getText();
    }
    public String findPriceOfBondClaim(){
        return webactions.getText(generateTabXPath(priceBaseField,bondClaimString));
    }

    /*Lien Waiver Tab*/


    public void clickOnLienWaiver(){
        driver.findElement(generateTabXPath(tabBaseField,lienWaiverString)).click();
    }
    public String findHeaderOfLienWaiver(){
        return driver.findElement(headerField).getText();
    }
    public String findPriceOfLienWaiver(){
        return webactions.getText(generateTabXPath(priceBaseField,lienWaiverString));
    }


    public By generateTabXPath(String base,String field){
        return new By.ByXPath(String.format(base,field));
    }
    //private By intentLienField = new By.ByXPath("//div[contains(@class, 'sc-AxjAm bcMPWx') and contains(.//div, 'Notice of Intent to Lien')]");


    //
}
